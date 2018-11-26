package com.sample.service;

import java.util.List;

import com.sample.entity.User;

public interface IUserService {

	User getUser(String userId);

	List<User> getUsers();

	User addUser(User user);

}
