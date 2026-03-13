// Creating Rest Controller UserController which
// defines various API's.
package org.excp.demo.controller;


import lombok.extern.slf4j.Slf4j;
import org.excp.demo.model.User;
import org.excp.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
public class UserController {

    @Autowired private UserService userService;

    @GetMapping("/getId/{id}")
    public String getUserId(@PathVariable("id") Long id) {
        return  "success"+id;
    }
    // Get User by Id
    @GetMapping("/get/{id}")
    public User getUser(@PathVariable("id") String id) {
        User userAllowed = userService.getUser(id);
        log.info("User Allowed  {} : " + userAllowed);
        return userAllowed;
    }

  



    // Add new User
    @PostMapping("/addUser")
    public List<User> adduser() {

        return (userService.addUsers());
    }
}