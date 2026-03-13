package org.excp.demo.repo;

import jakarta.annotation.Nonnull;
import org.excp.demo.exception.UserNotPermittedException;
import org.excp.demo.model.User;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

@Repository
public class UserRepositoryImpl implements UserRepository
{
    static List<User> userList = new ArrayList<>();

    @Override
    public User findById(String id) {
        Optional<User> user = Optional.of(getUsers().stream().filter( u -> u.getId().equalsIgnoreCase(id))
                .toList().get(0));
        int age = user.get().getAge();
        Predicate<Optional<User>> userOptionalPredicate =
                (User) -> age < 31;
        boolean isAgeGe30 = userOptionalPredicate.test(user);
        Optional<User> allowedUserOptional = isAgeGe30 ? user: Optional.empty();
        return allowedUserOptional.orElseThrow(() ->
                new UserNotPermittedException("NO USER WITH ALLOWED FOR GOVT JOB WITH ID = " + id + " AGE = " + age));
    }

    @Override
    public List<User> addUsers() {
        List<User> users = getUsers();
        userList.addAll(users);
        return userList;
    }

    @Nonnull
    private static List<User> getUsers() {
        return Arrays.asList(
                new User("Alice", "New York", 9, "Engineering"),
                new User("Bob", "San Francisco", 12, "Marketing"),
                new User("Charlie", "Chicago", 11, "Finance"),
                new User("David", "New York", 95, "Engineering"),
                new User("Eva", "San Francisco", 16, "Marketing"),
                new User("Frank", "Chicago", 105, "Finance")
        );
    }
}
