package factory;

public class ExcelDocument implements Document{
	@Override
	public void open() {
		System.out.println("EXCEL DOCUMENT OPENED");
	}
	@Override
	public void save() {
		System.out.println("EXCEL DOCUMENT SAVED");
	}
	@Override
	public void close() {
		System.out.println("EXCEL DOCUMENT CLOSED");
	}
}
