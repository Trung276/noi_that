package com.code.noi_that.dto.role;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@Setter
@ToString
public class RoleDto {
    private Long id;
    private String name;
}
