package com.code.noi_that.service.user;

import com.code.noi_that.convert.user.UserConvert;
import com.code.noi_that.dto.user.UserDto;
import com.code.noi_that.entity.user.User;
import com.code.noi_that.repository.user.UserRepository;
import com.code.noi_that.service.GeneralService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements GeneralService<UserDto> {

    private final UserRepository userRepository;
    private final UserConvert userConvert;

    public UserService(UserRepository userRepository, UserConvert userConvert) {
        this.userRepository = userRepository;
        this.userConvert = userConvert;
    }


    @Override
    public UserDto create(UserDto userDto) {
        User user = userConvert.convertToEntity(userDto);
        User savedUser = userRepository.save(user);
        return userConvert.convertToDto(savedUser);
    }

    @Override
    public List<UserDto> getAll() {
        List<User> userList = userRepository.findAll();
        return userConvert.convertToListDto(userList);
    }

    @Override
    public UserDto getById(Long id) {
        return userRepository.findById(id)
                .map(userConvert::convertToDto)
                .orElse(null);
    }

    @Override
    public UserDto update(Long id, UserDto userDto) {
        if (id == null || !userRepository.existsById(id)) {
            return null;
        }
        User user = userConvert.convertToEntity(userDto);
        User updatedUser = userRepository.save(user);
        return userConvert.convertToDto(updatedUser);
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }
}
