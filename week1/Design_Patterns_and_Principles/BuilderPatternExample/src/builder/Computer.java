package builder;

public class Computer {
	private int CPU;
	private int RAM;
	private int storage;
	private Computer(Builder builder){
		this.CPU=builder.CPU;
		this.RAM=builder.RAM;
		this.storage=builder.storage;
	}
	public void display() {
		System.out.println("CPU: "+CPU+" RAM: "+RAM+" STORAGE: "+storage);
	}
	public static class Builder
	{
		private int CPU;
		private int RAM;
		private int storage;
		
		public Builder setCPU(int CPU){
			this.CPU=CPU;
			return this;
		}
		public Builder setRAM(int RAM) {
			this.RAM=RAM;
			return this;
		}
		public Builder setStorage(int storage) {
			this.storage=storage;
			return this;
		}
		public Computer build() {
			return new Computer(this);
		}
	}
}
