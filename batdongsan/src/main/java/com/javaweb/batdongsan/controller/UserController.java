package com.javaweb.batdongsan.controller;

import com.javaweb.batdongsan.model.request.user.UserCreationRequest;
import com.javaweb.batdongsan.model.request.user.UserUpdateRequest;
import com.javaweb.batdongsan.model.response.ApiResponse;
import com.javaweb.batdongsan.model.response.user.UserResponse;
import com.javaweb.batdongsan.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/create")
    public ApiResponse<UserResponse> createUser(@RequestBody  @Valid UserCreationRequest request) {
        ApiResponse<UserResponse> response = new ApiResponse<>();
        response.setResult(userService.createRequest(request));
        response.setMessage("User created successfully");
        return response;
    }

    @GetMapping("/getAllUsers")
    public ApiResponse<List<UserResponse>> getAllUsers(){
        ApiResponse<List<UserResponse>> response = new ApiResponse<>();
        response.setResult(userService.getAllUsers());
        return response;
    }

    @GetMapping("/getById/{userId}")
    public ApiResponse<UserResponse> getUserById(@PathVariable String userId){
        ApiResponse<UserResponse> response = new ApiResponse<>();
        response.setResult(userService.getUserById(userId));
        return response;
    }

    @PutMapping("/update/{userId}")
    public ApiResponse<UserResponse> updateUser(@PathVariable String userId, @RequestBody @Valid UserUpdateRequest request) {
        ApiResponse<UserResponse> response = new ApiResponse<>();
        response.setResult(userService.updateUser(userId,request));
        response.setMessage("User updated successfully");
        return response;
    }

    @DeleteMapping("/delete/{userId}")
    public ApiResponse<String> deleteUserById(@PathVariable String userId) {
        ApiResponse<String> response = new ApiResponse<>();
        userService.deleteUser(userId);
        response.setResult("User deleted successfully");
        return response;
    }
}
