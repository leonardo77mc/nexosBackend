package com.nexos.services;

import com.nexos.daos.IRoleDao;
import com.nexos.models.Roles;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RoleServiceImplement implements RoleService {

    @Autowired
    private IRoleDao roleDao;

    @Override
    @Transactional(readOnly = true)
    public List<Roles> getAll() {
        return roleDao.findAll();
    }

    @Override
    @Transactional
    public Roles save(Roles role) {
        return roleDao.save(role);
    }

    @Override
    @Transactional
    public void delete(Roles roles) {
        roleDao.delete(roles);
    }

    @Override
    public Roles finById(long id) {
        return roleDao.findById(id).orElse(null);
    }
}
