package com.javaweb.batdongsan.exception;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.FieldDefaults;
import org.springframework.http.HttpStatusCode;

@Getter
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public enum ErrorCode {
    UNCATEGORIZED_EXCEPTION(500, "Uncategorized"),
    INVALID_KEY(400, "Invalid key"),
    USER_EXISTED(400, "User with user name Existed"),
    USERNAME_PASSWORD_INVALID(400, "User name / pass word  invalid (at least 6 characters)"),
    USER_NOT_FOUND(404, "User not found"),
    ROLE_EXISTED(400, "Role with this code existed"),
    ROLE_NOT_FOUND(404, "Role not found"),
    USER_ROLE_NOT_FOUND(404,"User with role not found" );

    int code;
    String message;

}
