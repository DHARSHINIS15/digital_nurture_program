package inventoryManagement;

public class InventoryManagementTest {

	public static void main(String[] args) {
		ProductManagement productinventory = new ProductManagement();
		Product product1=new Product(111,"Laptop",3,324567.64);
		Product product2=new Product(112,"Rings",17,5286.23);
		Product product3=new Product(113,"Mobile",14,548694.0);
		Product product4=new Product(114,"Bottles",45,88121.4);
		productinventory.addProduct(product1);
		productinventory.addProduct(product2);
		productinventory.addProduct(product3);
		productinventory.addProduct(product4);
		productinventory.display();
		productinventory.updateProduct(112, 27);
		System.out.println("After updating...");
		productinventory.display();
		productinventory.deleteProduct(product4);
		System.out.println("After Deleting...");
		productinventory.display();

	}

}
