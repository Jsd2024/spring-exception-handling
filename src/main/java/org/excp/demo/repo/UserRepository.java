package org.excp.demo.repo;

import org.excp.demo.model.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository
{
    User findById(String id);

    List<User> addUsers();
}
