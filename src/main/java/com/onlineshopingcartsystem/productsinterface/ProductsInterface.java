package com.onlineshopingcartsystem.productsinterface;

import com.onlineshoppingcartsystem.products.Products;

public interface ProductsInterface {
    void addProduct(Products p);
    void deleteProduct(String productId);
    void updateStockOfProduct();
    void viewProducts();
    void searchProductById(String productId);
    void searchProductByName(String productName);
}
