package com.javaweb.batdongsan.service.impl;

import com.javaweb.batdongsan.converter.UserConverter;
import com.javaweb.batdongsan.entity.User;
import com.javaweb.batdongsan.exception.AppException;
import com.javaweb.batdongsan.exception.ErrorCode;
import com.javaweb.batdongsan.model.request.user.UserCreationRequest;
import com.javaweb.batdongsan.model.request.user.UserUpdateRequest;
import com.javaweb.batdongsan.model.response.user.UserResponse;
import com.javaweb.batdongsan.repository.UserRepository;
import com.javaweb.batdongsan.service.UserService;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userRepository;
    @Autowired
    UserConverter userConverter;

    public UserResponse createRequest(UserCreationRequest request){
        User user = userConverter.toEntity(request);
        if(userRepository.existsByUserName(user.getUserName())){
            throw new AppException(ErrorCode.USER_EXISTED);
        }
        userRepository.save(user);
        return userConverter.toResponse(user);
    }

    @Override
    public List<UserResponse> getAllUsers() {
        List<User> users = userRepository.findAll();
        List<UserResponse> userResponseList = users.stream()
                .map((user) -> userConverter.toResponse(user))
                .toList();

        return userResponseList;
    }

    @Override
    public UserResponse getUserById(Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new AppException(ErrorCode.USER_NOT_FOUND));
        UserResponse userResponse = userConverter.toResponse(user);
        return userResponse;
    }

    @Override
    public UserResponse updateUser(Long userId, UserUpdateRequest request) {

        User user = userRepository.findById(userId)
                .orElseThrow(() -> new AppException(ErrorCode.USER_NOT_FOUND));

        user = userConverter.toEntity(user,request);
        userRepository.save(user);
        return userConverter.toResponse(user);
    }

    @Override
    public void deleteUser(Long userId) {
        User user = userRepository.findById(userId)
                .orElseThrow(() -> new AppException(ErrorCode.USER_NOT_FOUND));
        userRepository.delete(user);
    }
}
