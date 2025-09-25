package com.javaweb.batdongsan.converter;

import com.javaweb.batdongsan.entity.User;
import com.javaweb.batdongsan.model.request.user.UserCreationRequest;
import com.javaweb.batdongsan.model.request.user.UserUpdateRequest;
import com.javaweb.batdongsan.model.response.user.UserResponse;
import com.javaweb.batdongsan.repository.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private UserRepository userRepository;


    public UserResponse toResponse(User user){
        UserResponse userResponse = modelMapper.map(user, UserResponse.class);
        return userResponse;
    }

//    new user
    public User toEntity(UserCreationRequest request){
        User user = new User();
        modelMapper.map(request,user);
        return user;
    }

//    update user
    public User toEntity(User user,UserUpdateRequest request){
         modelMapper.map(request,user);
        return user;
    }

}
