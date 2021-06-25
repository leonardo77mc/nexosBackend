package com.nexos.services;

import com.nexos.models.Roles;

import java.util.List;

public interface RoleService {

    public List<Roles> getAll();

    public Roles save(Roles role);

    public void delete(Roles roles);

    public Roles finById(long id);

}
