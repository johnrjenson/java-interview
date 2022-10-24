package com.rightpoint.app.controller;

import com.rightpoint.app.domain.User;
import com.rightpoint.app.service.UserService;

import java.util.List;

public class UserController {

  private final UserService userService;

  public UserController(UserService userService) {
    this.userService = userService;
  }

  public User get(Long id) {
    return userService.getById(id);
  }

  public void post(User user) {
    userService.save(user);
  }

  public void put(User user) {
    userService.save(user);
  }

  public void delete(Long id) {
    userService.delete(id);
  }

  public void bulkUpdate(List<User> users) {
    userService.bulkUpdate(users);
  }

}
