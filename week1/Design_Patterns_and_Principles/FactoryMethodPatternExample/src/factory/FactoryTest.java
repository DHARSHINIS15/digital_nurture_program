package factory;

public class FactoryTest {

	public static void main(String[] args) {
		DocumentFactory df = new WordFactory();
		Document word=df.createDocument();
		word.open();
		word.save();
		word.close();
		DocumentFactory df2 = new PdfFactory();
		Document pdf=df2.createDocument();
		pdf.open();
		pdf.close();
		pdf.save();
		DocumentFactory df3 = new ExcelFactory();
		Document excel=df3.createDocument();
		excel.open();
		excel.close();
		excel.save();
		

	}

}
