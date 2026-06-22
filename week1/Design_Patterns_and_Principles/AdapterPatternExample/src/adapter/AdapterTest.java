package adapter;

public class AdapterTest {

	public static void main(String[] args) {
		PaymentProcessor paypal=new PayPalAdapter();
		PaymentProcessor razor=new RazorPayAdapter();
		PaymentProcessor stripe=new StripeAdapter();
		paypal.initializePayment(50000.58);
		paypal.processPayment(563210);
		paypal.refundPayment(10000);
		razor.initializePayment(85600.08);
		razor.processPayment(123210);
		razor.refundPayment(5000);
		stripe.initializePayment(60000);
		stripe.processPayment(45650);
		stripe.refundPayment(1000);
		

	}

}
