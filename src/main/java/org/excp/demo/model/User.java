package org.excp.demo.model;

import lombok.Data;

@Data
public class User {
    String id;
    String city;
    int age;
    String name;

    public User(String id, String city, int age, String name) {
        this.id = id;
        this.city = city;
        this.age = age;
        this.name = name;
    }
//
//    public String getId() {
//        return id;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setId(String id) {
//        this.id = id;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "name='" + id + '\'' +
//                ", city='" + city + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
