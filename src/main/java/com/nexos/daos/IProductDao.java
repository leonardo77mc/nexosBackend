package com.nexos.daos;

import com.nexos.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProductDao extends JpaRepository<Product, Long> {
}
