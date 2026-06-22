package adapter;

public class PayPalAdapter implements PaymentProcessor{
	public PayPalGateway paypal;
	PayPalAdapter(){
		paypal=new PayPalGateway();
	}
	@Override
	public void initializePayment(double amount) {
		System.out.println("PayPalPay -> Initialize Amount: "+amount);
	}
	@Override
	public void processPayment(double amount) {
		System.out.println("PayPalPay -> Processing Amount: "+amount);
	}
	@Override
	public void refundPayment(double amount) {
		System.out.println("PayPalPay -> Refund Amount: "+amount);
	}
}
