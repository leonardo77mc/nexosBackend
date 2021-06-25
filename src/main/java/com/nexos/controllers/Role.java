package com.nexos.controllers;

import com.nexos.models.Roles;
import com.nexos.services.RoleService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/role")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET,RequestMethod.POST})
public class Role {

    @Autowired
    private RoleService roleService;

    @GetMapping("/getRoles")
    List<Roles> getRoles() {
        return roleService.getAll();
    }

    @PostMapping("/save")
    Roles save(@RequestBody() Roles role) {
        Roles response = null;
        try {
           response = roleService.save(role);
        } catch (RuntimeException e) {
           System.out.println("Error al crear el rol");
        }
        return response;
    }

    @GetMapping("/allRoles")
    List<Roles> getAllRoles(){
        List<Roles> listRoles = new ArrayList<>();
        try {
            listRoles = roleService.getAll();
        }catch (RuntimeException e) {
            System.out.println("Error al obtener la lista de roles");
        }
        return listRoles;
    }
}
