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

  private final Map<Long, User> users = new HashMap<>();

  public User getById(Long id) {
    return users.get(id);
  }

  public void insert(User user) {
    user.setId(getNextId());
    users.put(user.getId(), user);
  }

  public void update(User user) {
    users.put(user.getId(), user);
  }

  public void delete(Long id) {
    users.remove(id);
  }

  public Collection<User> getAll() {
    return users.values();
  }

  private long nextId = 1;

  private Long getNextId() {
    return nextId++;
  }
}
