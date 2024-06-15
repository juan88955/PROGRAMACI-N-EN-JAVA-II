package co.com.ps.C23A.service;

import co.com.ps.C23A.domain.Products;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService {
    @Override
    public Products findById(Long idProducts) {
        return null;
    }

    @Override
    public Products findByName(String name) {
        return null;
    }

    @Override
    public List<Products> findAll() {
        return List.of();
    }

    @Override
    public Products save(ProductService products) {
        return null;
    }

    @Override
    public Products update(Products products) {
        return null;
    }

    @Override
    public void delete(Long idProducts) {

    }

    @Override
    public Object save(Products product) {
        return null;
    }
}
