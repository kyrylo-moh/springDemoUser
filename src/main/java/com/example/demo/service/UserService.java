package com.example.demo.service;

import com.example.demo.dto.UserDTO;
import com.example.demo.exception.UserDeleteException;
import com.example.demo.exception.UserUpdateException;
import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    private Logger log = LoggerFactory.getLogger(UserService.class);

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User save(UserDTO userDTO) {
        User user = new User(userDTO.getEmail(), userDTO.getNickname(), userDTO.getPassword());
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.getAllByIdIsNotNull();
    }
    public User getUserById(Long id) {
        return userRepository.findUserById(id);
    }

    public void delete(UserDTO userDTO) {
        if (userRepository.findById(userDTO.getId()).isPresent()) {
            User user = userRepository.getOne(userDTO.getId());
            userRepository.delete(user);
            log.info("Was deleted" + userDTO.toString());
        }
        log.warn("Can`t delete user");
        throw new UserDeleteException(
                "Can`t delete user - " + userDTO.toString());
    }

    public User update(UserDTO userDTO) {
        if(userRepository.findById(userDTO.getId()).isPresent()) {
            User user = userRepository.findUserById(userDTO.getId());
            user.setEmail(userDTO.getEmail());
            user.setNickname(userDTO.getNickname());
            user.setPassword(userDTO.getPassword());
            return userRepository.save(user);
        }
        log.warn( "Can not update user - " + userDTO.toString());
        throw new UserUpdateException(
                "Can not update user - " + userDTO.toString());
    }
}
