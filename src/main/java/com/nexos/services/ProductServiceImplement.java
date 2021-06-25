package com.nexos.services;

import com.nexos.daos.IProductDao;
import com.nexos.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServiceImplement implements ProductService {

    @Autowired
    private IProductDao productDao;

    @Override
    @Transactional(readOnly = true)
    public List<Product> getAll() {
        return productDao.findAll();
    }

    @Override
    @Transactional
    public Product save(Product product) {
        return productDao.save(product);
    }

    @Override
    @Transactional
    public void delete(Product product) {
         productDao.delete(product);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Product> search(Product product) {
        return productDao.findById(product.getId());
    }


}
