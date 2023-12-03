package com.code.noi_that.convert.role;

import com.code.noi_that.convert.GeneralConvert;
import com.code.noi_that.dto.role.RoleDto;
import com.code.noi_that.entity.role.Role;

import java.util.List;

public class RoleConvert implements GeneralConvert<Role, RoleDto> {
    @Override
    public RoleDto convertToDto(Role role) {
        return null;
    }

    @Override
    public Role convertToEntity(RoleDto roleDto) {
        return null;
    }

    @Override
    public List<RoleDto> convertToListDto(List<Role> roles) {
        return null;
    }

    @Override
    public List<Role> convertToEntityList(List<RoleDto> roleDtos) {
        return null;
    }
}
