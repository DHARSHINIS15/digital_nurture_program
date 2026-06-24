package observer;

public class ObserverTest {

	public static void main(String[] args) {
		StockMarket stock = new StockMarket();
		Observer mobileapp=new MobileApp("test1");
		Observer webapp=new WebApp("test2");
		stock.register(mobileapp);
		stock.register(webapp);
		stock.setAlert("Stock increased");

	}

}
