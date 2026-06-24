package observer;

public class MobileApp implements Observer {
	String name;
	MobileApp(String name){
		this.name=name;
	}
	@Override
	public void update(String alert) {
		System.out.println(name+" recieved "+alert);
	}
}
