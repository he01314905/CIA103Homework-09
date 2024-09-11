package hw7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class hw7 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		SampleTXT txt= new SampleTXT();
		
		txt.pr();
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
			FileOutputStream fo=new FileOutputStream(f);
			ObjectOutputStream fw=new ObjectOutputStream(fo);
		
			for(int i=0;i<animal.length;i++) {
			 fw.writeObject(animal[i]);
			}	
			fw.close();
			fo.close();
			
			FileInputStream fi=new FileInputStream(f);
			ObjectInput oi =new ObjectInputStream(fi);
			try {
				while(true)
				((SampleTXT)oi.readObject()).speak();
			}catch(IOException e) {
				
			}
			oi.close();
			fi.close();
	
	
	
	}
	}

