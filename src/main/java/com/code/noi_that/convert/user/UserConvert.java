package com.code.noi_that.convert.user;

import com.code.noi_that.convert.GeneralConvert;
import com.code.noi_that.dto.user.UserDto;
import com.code.noi_that.entity.user.User;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserConvert implements GeneralConvert<User, UserDto> {
    @Override
    public UserDto convertToDto(User user) {
        return null;
    }

    @Override
    public User convertToEntity(UserDto userDto) {
        return null;
    }

    @Override
    public List<UserDto> convertToListDto(List<User> users) {
        return null;
    }

    @Override
    public List<User> convertToEntityList(List<UserDto> userDtos) {
        return null;
    }
}
