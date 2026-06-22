package factory;

public class WordDocument implements Document{
	@Override
	public void open() {
		System.out.println("WORD DOCUMENT OPENED");
	}
	@Override
	public void save() {
		System.out.println("WORD DOCUMENT SAVED");
	}
	@Override
	public void close() {
		System.out.println("WORD DOCUMENT CLOSED");
	}
}
