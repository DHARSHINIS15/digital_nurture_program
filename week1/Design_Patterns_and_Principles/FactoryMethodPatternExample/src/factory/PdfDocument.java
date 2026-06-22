package factory;

public class PdfDocument implements Document {
	@Override
	public void open() {
		System.out.println("PDF DOCUMENT OPENED");
	}
	@Override
	public void save() {
		System.out.println("PDF DOCUMENT SAVED");
	}
	@Override
	public void close() {
		System.out.println("PDF DOCUMENT CLOSED");
	}
}
