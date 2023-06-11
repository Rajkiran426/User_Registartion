package com.userRegistration.service;

import com.userRegistration.payloads.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO createUser(UserDTO userRegistrationDTO);
    UserDTO getUserById(Long userId);
    List<UserDTO> getAllUsers();
    void deleteUser(Long userId);
}
