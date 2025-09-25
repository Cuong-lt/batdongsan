package com.javaweb.batdongsan.service;

import com.javaweb.batdongsan.model.request.user_role.UserRoleRequest;
import com.javaweb.batdongsan.model.response.user_role.UserRoleResponse;

import java.util.List;

public interface UserRoleService {
    UserRoleResponse addRoleToUser(UserRoleRequest request);

    UserRoleResponse getById(String id);

    List<UserRoleResponse> getAll();

    UserRoleResponse updateUserRoleById(String id, UserRoleRequest request);

    void deleteUserRoleById(String id);

    List<UserRoleResponse> getByUserName(String userName);

    List<UserRoleResponse> getByRoleCode(String code);
}
