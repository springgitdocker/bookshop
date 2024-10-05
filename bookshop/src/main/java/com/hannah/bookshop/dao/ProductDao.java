package com.hannah.bookshop.dao;

import com.hannah.bookshop.model.Product;

public interface ProductDao {

    Product getProductById(Integer productId);
}
