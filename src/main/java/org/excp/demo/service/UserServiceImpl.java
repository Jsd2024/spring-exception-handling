// Implementing the service class
package org.excp.demo.service;


import java.util.List;

import org.excp.demo.model.User;
import org.excp.demo.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    // Method to get customer by Id. Throws
    // NoSuchElementException for invalid Id
    @Override
    public User getUser(String id) {
        return userRepository.findById(id);
    }

  
    // Simplifying the addCustomer and updateCustomer
    // methods with Optional for better readability.
    @Override
    public List<User> addUsers() {
        return userRepository.addUsers();
    }
}