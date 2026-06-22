package adapter;

public class RazorPayAdapter implements PaymentProcessor{
	public RazorpayGateway razorpay;
	public RazorPayAdapter() {
		razorpay=new RazorpayGateway();
	}
	@Override
	public void initializePayment(double amount) {
		System.out.println("RazorPay -> Initialize Amount: "+amount);
	}
	@Override
	public void processPayment(double amount) {
		System.out.println("RazorPay -> Processing Amount: "+amount);
	}
	@Override
	public void refundPayment(double amount) {
		System.out.println("RazorPay -> Refund Amount: "+amount);
	}
}
