package inventoryManagement;

import java.util.ArrayList;

public class ProductManagement {
	ArrayList<Product> products=new ArrayList<>();
//	Product product;
//	ProductManagement(Product product){
//		this.product=product;
//	}
	public void addProduct(Product product) {
		products.add(product);
	}
	public void updateProduct(int id,String name) {
		for(Product product:products) {
			if(product.productId==id) {
				product.productName=name;
			}
		}
	}
	public void updateProduct(int id,int quantity) {
		for(Product product:products) {
			if(product.productId==id) {
				product.quantity=quantity;
			}
		}
	}
	public void updateProduct(int id,double price) {
		for(Product product:products) {
			if(product.productId==id) {
				product.price=price;
			}
		}
	}
	public void deleteProduct(Product product) {
		products.remove(product);
	}
	
	public void display() {
		for(Product product:products) {
			System.out.println("Id:"+product.productId+" Name:"+product.productName+" Quantity:"+product.quantity+" Price:"+product.price);
		}
	}
}
