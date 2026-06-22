package adapter;

public interface PaymentProcessor {
	public void initializePayment(double amount);
	public void processPayment(double amount);
	public void refundPayment(double amount);
}
