package com.javaweb.batdongsan.model.response.role;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RoleResponse {
    String id;
    String roleName;
    String code;
    LocalDateTime createdDate;
    LocalDateTime modifiedDate;
//    String modifiedBy;
}
