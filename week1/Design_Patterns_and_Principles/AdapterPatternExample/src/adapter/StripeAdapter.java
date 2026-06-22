package adapter;

public class StripeAdapter implements PaymentProcessor {
	public StripeGateway stripe;
	public StripeAdapter() {
		stripe=new StripeGateway();
	}
	@Override
	public void initializePayment(double amount) {
		System.out.println("Stripe -> Initialize Amount: "+amount);
	}
	@Override
	public void processPayment(double amount) {
		System.out.println("Stripe -> Processing Amount: "+amount);
	}
	@Override
	public void refundPayment(double amount) {
		System.out.println("Stripe -> Refund Amount: "+amount);
	}
}
