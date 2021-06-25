package com.nexos.daos;

import com.nexos.models.Roles;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleDao extends JpaRepository<Roles, Long> {
}
