package com.hoaxify.hoaxify.user;

import com.hoaxify.hoaxify.shared.GenericResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(path="api/v1/users")
    public GenericResponse CreateUser(@RequestBody User user) {
        userService.save(user);
        return new GenericResponse("User created");
    }
}
