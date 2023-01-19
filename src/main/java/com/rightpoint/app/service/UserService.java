package com.rightpoint.app.service;

import com.rightpoint.app.dao.UserDao;
import com.rightpoint.app.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

  private final UserDao userDao;

  public UserService(UserDao userDao) {
    this.userDao = userDao;
  }

  public User getById(Long id) {
    return userDao.getById(id);
  }

  public void save(User user) {
    Long id = user.getId();

    if(id == null || id == 0) {
      userDao.insert(user);
    } else {
      userDao.update(user);
    }
  }

  public void delete(Long id) {
    userDao.delete(id);
  }

  public void bulkUpdate(List<User> users) {
    for(User user : users) {
      userDao.update(user);
    }
  }

}
