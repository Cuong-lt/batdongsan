package com.javaweb.batdongsan.model.response.user_role;

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
    String userName;
    String code;
    String roleName;
    LocalDateTime createdDate;
    LocalDateTime modifiedDate;
}
