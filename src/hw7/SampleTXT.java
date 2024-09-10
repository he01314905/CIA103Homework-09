package hw7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SampleTXT {
	private String name;
	public SampleTXT() throws IOException {
		String b;
		int a = 0;
		try {
			File file = new File("src/hw7/Sample.txt");
			FileReader fr = new FileReader(file);
			BufferedReader bu = new BufferedReader(fr);
			int count = 0;
			while ((b = bu.readLine()) != null) {
				System.out.println(b);
				count++;
				a += b.length();
			}
			System.out.println();
			System.out.print("file size:" + file.length() + "個位元組" + " ," + a + "個字元" + "," + count + "行資料");
			bu.close();
			fr.close();

		} catch (IOException e) {
			e.getStackTrace();
		}
		System.out.println();
	}

	public void random() throws IOException {
		System.out.println();
		try {
			FileWriter fw = new FileWriter("src/hw7/Data.txt", true);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw);
			for (int i = 0; i < 10; i++) {
				int r = (int) (Math.random() * 1000) + 1;
				pw.print(r + ",");
			}
			pw.println();
			pw.close();
			bw.close();
			fw.close();
		} catch (IOException e) {
			e.getStackTrace();
		}
	}

	public void CopyFile(File b, File c) throws IOException {
		FileReader fi = new FileReader(b);
		BufferedReader br = new BufferedReader(fi);
		FileWriter fw = new FileWriter(c);
		BufferedWriter bw = new BufferedWriter(fw);
		int a;
		while ((a = fi.read()) != -1) {
			fw.write(a);
		}
		fw.close();
		fi.close();
	}
	public void speak() throws IOException {
		
		
	}
}
