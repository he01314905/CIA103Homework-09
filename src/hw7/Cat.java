package hw7;

import java.io.IOException;

public class Cat  extends SampleTXT{
	private String name;
	
	public Cat(String name) throws IOException {
		this.name = name;
	}
	
	public void speak() {
		
		System.out.println("This is Cat "+name);
	}
	
}
