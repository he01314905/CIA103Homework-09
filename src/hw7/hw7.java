package hw7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class hw7 {
	public static void main(String[] args) throws IOException {
		SampleTXT txt= new SampleTXT();
		txt.random();
		File file=new File("src/hw7/Sample.txt");
		File copyFile=new File("src/hw7/Data2.txt");
		txt.CopyFile(file,copyFile);
		
		SampleTXT[] animal=new SampleTXT[4];
		animal[0] =new Dog("david");
		animal[1] =new Dog("snoopy");
		animal[2]=new Cat("Kitty");
		animal[3]=new Cat("jarfi");
		
			File f=new File("C:/data/Object.ser");
			
			if(!f.getParentFile().exists()) {
			f.mkdirs();
			f.createNewFile();
			}
			FileWriter fw=new FileWriter(f);
			PrintWriter pw=new PrintWriter(fw);
			for(int i=0;i<animal.length;i++) {
				pw.println((char)animal[i]);
			}
			pw.close();
			fw.close();
		
	}
	}

