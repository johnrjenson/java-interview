package com.rightpoint.app.dao;

import com.rightpoint.app.domain.User;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * An in-memory implementation of a basic User DAO *
 */

@Service
public class UserDao {

  private final Map<Long, User> userMap = new HashMap<>();

  public User getById(Long id) {
    return userMap.get(id);
  }

  public void insert(User user) {
    user.setId(getNextId());
    userMap.put(user.getId(), user);
  }

  public void update(User user) {
    userMap.put(user.getId(), user);
  }

  public void delete(Long id) {
    userMap.remove(id);
  }

  public Collection<User> getAll() {
    return userMap.values();
  }

  private long nextId = 1;

  private Long getNextId() {
    return nextId++;
  }
}
