package co.com.ps.C23A.service;

import co.com.ps.C23A.domain.Products;

import java.util.List;

public interface IProductService {
    Products findById(Long idProducts);
    Products findByName(String name);
    List<Products> findAll();
    Products save(ProductService products);
    Products update(Products products);
    void delete(Long idProducts);

    Object save(Products product);
}