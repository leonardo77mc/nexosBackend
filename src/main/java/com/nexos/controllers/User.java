package com.nexos.controllers;

import com.nexos.models.Roles;
import com.nexos.models.UserRoles;
import com.nexos.services.RoleService;
import com.nexos.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class User {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;

    @GetMapping("/getAllUsers")
    List<com.nexos.models.User> getUsers() {
        return userService.getAll();
    }

    @PostMapping("/save")
    com.nexos.models.User save(@RequestBody() com.nexos.models.User user) {
        com.nexos.models.User response = null;

        try{
            response = userService.save(user);

        } catch (RuntimeException e) {
            System.out.println("Error al guardar el usuario");
        }
        return response;
    }
}
