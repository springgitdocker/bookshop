package com.hannah.bookshop.service.impl;

import com.hannah.bookshop.dao.ProductDao;
import com.hannah.bookshop.model.Product;
import com.hannah.bookshop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductDao productDao;

    @Override
    public Product getProductById(Integer productId) {
        return productDao.getProductById(productId);
    }
}
