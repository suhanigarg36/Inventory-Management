package com.testing.loginsystem.service.impl;

import com.testing.loginsystem.datamodel.request.Product;
import com.testing.loginsystem.datamodel.request.ProductsRepository;
import com.testing.loginsystem.service.AddProducts;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
@Slf4j
public class AddProductsImpl implements AddProducts {

    @Autowired
    private ProductsRepository repo;

    public String getProducts(Product product) {
        repo.insert(product);
        return ("Product added successfully");
    }
}
