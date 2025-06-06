package com.onlineshoppingcartsystem.main;

import java.util.Scanner;

import com.onlineshopingcartsystem.productsimpleme.ProductsImple;
import com.onlineshopingcartsystem.productsinterface.ProductsInterface;
import com.onlineshoppingcartsystem.products.Products;

public class OnlineShoppingApplication {

	public static void main(String[] args) {

		ProductsInterface pi = new ProductsImple();
		Scanner sc = new Scanner(System.in);

		try {
			while (true) {
				System.out.println("\n===== Online Shopping Cart Menu =====");
				System.out.println("1) Add product");
				System.out.println("2) Delete product by ID");
				System.out.println("3) Update stock of product");
				System.out.println("4) View products");
				System.out.println("5) Search product by ID");
				System.out.println("6) Search product by Name");
				System.out.println("7) Exit");
				System.out.print("Enter a number: ");
				int n = sc.nextInt();

				switch (n) {
				case 1:
					System.out.print("Enter product name: ");
					String productName = sc.next();
					System.out.print("Enter product ID: ");
					String productId = sc.next();
					System.out.print("Enter product price: ");
					double productPrice = sc.nextDouble();
					System.out.print("Enter product stock: ");
					int productStock = sc.nextInt();
					Products p = new Products(productName, productId, productPrice, productStock);
					pi.addProduct(p);
					break;

				case 2:
					System.out.print("Enter product ID to delete: ");
					String deleteProductId = sc.next();
					pi.deleteProduct(deleteProductId);
					break;

				case 3:
					pi.updateStockOfProduct();
					break;

				case 4:
					pi.viewProducts();
					break;

				case 5:
					System.out.print("Enter product ID to search: ");
					String searchId = sc.next();
					pi.searchProductById(searchId);
					break;

				case 6:
					System.out.print("Enter product name to search: ");
					String searchName = sc.next();
					pi.searchProductByName(searchName);
					break;

				case 7:
					System.out.println("Exiting application...");
					System.exit(0);

				default:
					System.out.println("Invalid option. Please try again.");
					break;
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
	}
}
