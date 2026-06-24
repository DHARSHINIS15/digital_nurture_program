package observer;

public class WebApp implements Observer{
	String name;
	WebApp(String name){
		this.name=name;
	}
	@Override
	public void update(String alert) {
		System.out.println(name+" recieved "+alert);
	}
}
