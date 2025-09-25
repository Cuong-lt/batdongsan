package com.javaweb.batdongsan.service;


import com.javaweb.batdongsan.model.request.role.RoleRequest;
import com.javaweb.batdongsan.model.response.role.RoleResponse;
import jakarta.validation.Valid;

import java.util.List;

public interface RoleService {
    RoleResponse createRole(@Valid RoleRequest request);

    List<RoleResponse> getAllRoles();

    RoleResponse getRoleById(String roleId);

    RoleResponse updateRole(String roleId, @Valid RoleRequest request);

    void deleteRoleById(String roleId);
}
