package hw7;

import java.io.IOException;

public class Dog extends SampleTXT {
	private String name;
	private static final long serialVersionUID = 1L;
	public  Dog(String name)throws IOException {
		this.name = name;
	}
	
	public void speak() throws IOException {
		super.speak();
		System.out.println("This is Dog "+name);
	}
}
