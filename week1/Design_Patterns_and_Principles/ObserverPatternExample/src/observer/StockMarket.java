package observer;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock{
	List<Observer> observers=new ArrayList<>();
	private String alert;
	@Override
	public void register(Observer observer) {
		observers.add(observer);
	}
	@Override
	public void deregister(Observer observer) {
		observers.remove(observer);
	}
	@Override
	public void notifyUser() {
		for(Observer observer:observers) {
			observer.update(alert);
		}
	}
	public void setAlert(String alert) {
		this.alert=alert;
		notifyUser();
	}
}
