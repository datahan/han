package com.datawisher.service;

import com.datawisher.service.bean.Product;

public class ProductServiceImpl implements ProductService {
    @Override
    public Product queryById(long id) {

        Product product = new Product();
        product.setId(id);
        product.setName("water");
        product.setPrice(1.0);
        return product;
    }
}
