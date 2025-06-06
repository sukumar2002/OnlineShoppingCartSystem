package com.onlineshopingcartsystem.productsimpleme;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.onlineshopingcartsystem.productsinterface.ProductsInterface;
import com.onlineshoppingcartsystem.products.Products;

public class ProductsImple implements ProductsInterface {

	private List<Products> products = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	@Override
	public void addProduct(Products p) {
		products.add(p);
		System.out.println("Product added successfully.");
	}

	@Override
	public void deleteProduct(String productId) {
		boolean found = false;
		Iterator<Products> iterator = products.iterator();
		while (iterator.hasNext()) {
			Products p = iterator.next();
			if (p.getProductId().equalsIgnoreCase(productId)) {
				iterator.remove();
				found = true;
				System.out.println("Product deleted successfully.");
				break;
			}
		}
		if (!found) {
			System.out.println("No product found with ID: " + productId);
		}
	}

	@Override
	public void updateStockOfProduct() {
		System.out.println("Enter the Product ID to update stock:");
		String id = sc.next();
		boolean found = false;

		for (Products p : products) {
			if (p.getProductId().equalsIgnoreCase(id)) {
				System.out.println("Current stock: " + p.getProductStock());
				System.out.println("Enter new stock:");
				int newStock = sc.nextInt();
				p.setProductStock(newStock);
				System.out.println("Stock updated successfully.");
				found = true;
				break;
			}
		}

		if (!found) {
			System.out.println("Product not found with ID: " + id);
		}
	}

	@Override
	public void viewProducts() {
		if (products.isEmpty()) {
			System.out.println("No products available.");
			return;
		}
		System.out.println("----- All Products -----");
		for (Products p : products) {
			System.out.println(p);
		}
	}

	@Override
	public void searchProductById(String productId) {
		boolean found = false;
		for (Products p : products) {
			if (p.getProductId().equalsIgnoreCase(productId)) {
				System.out.println("Product Found: " + p);
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("No product found with ID: " + productId);
		}
	}

	@Override
	public void searchProductByName(String productName) {
		boolean found = false;
		for (Products p : products) {
			if (p.getProductName().equalsIgnoreCase(productName)) {
				System.out.println("Product Found: " + p);
				found = true;
			}
		}
		if (!found) {
			System.out.println("No product found with name: " + productName);
		}
	}
}
