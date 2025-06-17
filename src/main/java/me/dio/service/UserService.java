package me.dio.service;

import me.dio.domain.model.User;

public interface UserService {

    User findById(Long Id);

    User create(User userToCreate);
}
