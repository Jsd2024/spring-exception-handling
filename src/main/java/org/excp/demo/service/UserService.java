// Creating service interface
package org.excp.demo.service;

import org.excp.demo.model.User;

import java.util.List;

public interface UserService {

    // Method to get customer by its Id
    User getUser(String id);

    // Simplifying the addCustomer and updateCustomer
    // methods with Optional for better readability.
    List<User> addUsers();

//    // Method to add a new Customer
//    // into the database
//    String addCustomer(Customer customer);
//
//    // Method to update details of a Customer
//    String updateCustomer(Customer customer);
}