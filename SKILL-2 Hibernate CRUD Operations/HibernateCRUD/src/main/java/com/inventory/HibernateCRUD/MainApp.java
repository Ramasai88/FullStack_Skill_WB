package com.inventory.HibernateCRUD;

public class MainApp {

public static void main(String[] args){

	ProductDAO dao = new ProductDAO();

	Product p1 = new Product("Laptop", "Dell Laptop", 50000, 10);
	Product p2 = new Product("Phone", "Samsung Phone", 25000, 20);
	Product p3 = new Product("Tablet", "Lenovo Tablet", 15000, 15);

	dao.insertProduct(p1);
	dao.insertProduct(p2);
	dao.insertProduct(p3);

	Product product = dao.getProduct(1);
	System.out.println("Product Name: " + product.getName());

	dao.updateProduct(1,48000,8);

	dao.deleteProduct(2);

	System.out.println("CRUD Operations Completed");

}
}