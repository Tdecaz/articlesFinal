package com.artkls.articles.controllers;

import com.artkls.articles.models.User;
import com.artkls.articles.repositories.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequiredArgsConstructor
public class UsersRestController extends ApiRestController {
    private final UsersRepository usersRepository;

    @GetMapping("/users")
    List<User> getUsers() {
        return (List<User>) usersRepository.findAll();
    }

    @PostMapping("/users")
    User createUser(@RequestBody User user) {
        return this.usersRepository.save(user);
    }
}
