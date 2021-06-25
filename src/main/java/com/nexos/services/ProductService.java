package com.nexos.services;

import com.nexos.models.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {

    public List<Product> getAll();

    public Product save(Product product);

    public void delete(Product product);

    public Optional<Product> search(Product product);

}
