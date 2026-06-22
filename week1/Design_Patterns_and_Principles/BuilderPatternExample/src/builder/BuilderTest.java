package builder;

import builder.Computer.Builder;

public class BuilderTest {

	public static void main(String[] args) {
		Computer obj= new Computer.Builder()
				.setCPU(16)
				.setRAM(6)
				.setStorage(256)
				.build();
		obj.display();

	}

}
