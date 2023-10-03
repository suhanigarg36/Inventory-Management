package com.testing.loginsystem.service.impl;

import com.testing.loginsystem.datamodel.request.Product;
import com.testing.loginsystem.datamodel.request.ProductsRepository;
import com.testing.loginsystem.service.GetProductsList;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j

public class GetProductsListImpl implements GetProductsList {

    @Autowired
    private ProductsRepository repo;

    public List<Product> getList(){

        List<Product> p = repo.findAll();
        log.info("product_list: {}", p);
        return p;
    }



}
