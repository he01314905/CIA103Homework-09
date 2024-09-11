package hw7;

import java.io.IOException;

public class Cat  extends SampleTXT{
	private String name;
	private static final long serialVersionUID = 1L;
	public Cat(String name) throws IOException {
		this.name = name;
	}
	
	public void speak() throws IOException {
		super.speak();
		System.out.println("This is Cat "+name);
	}
	
}
