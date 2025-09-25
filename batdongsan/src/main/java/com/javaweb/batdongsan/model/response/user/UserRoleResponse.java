package com.javaweb.batdongsan.model.response.user;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserRoleResponse {
    String id;
    String userId;
    String userName;
    String roleId;
    String roleName;
    LocalDateTime createdDate;
    LocalDateTime modifiedDate;
}
