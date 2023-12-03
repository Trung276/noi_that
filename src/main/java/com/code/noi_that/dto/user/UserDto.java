package com.code.noi_that.dto.user;

import com.code.noi_that.dto.role.RoleDto;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class UserDto {
    private Long id;
    private String username;
    private String password;
    private String avatar;
    private RoleDto role;
}
