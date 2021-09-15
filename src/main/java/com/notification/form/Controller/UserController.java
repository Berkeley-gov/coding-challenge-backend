package com.notification.form.Controller;

import com.notification.form.model.User;
import com.notification.form.repository.SupervisorRepository;
import com.notification.form.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.CrossOrigin;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping(value = "/api")
public class UserController {

    @Autowired
    private final UserRepository userRepository;

    @Autowired
    private final SupervisorRepository supervisorRepository;

    public UserController(UserRepository userRepository, SupervisorRepository supervisorRepository) {
        this.userRepository = userRepository;
        this.supervisorRepository = supervisorRepository;
    }

    @GetMapping(value = "/users")
    public List<User> findAllUsers() {
        return this.userRepository.findAll();
    }

    @CrossOrigin(origins = "http://localhost:8080")
    @PostMapping(value = "/submit")
    public User saveUser(@Valid @NotNull @RequestBody User user) {
        this.supervisorRepository.save(user.getSupervisor());
        return this.userRepository.save(user);
    }
}
