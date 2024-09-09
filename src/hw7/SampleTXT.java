package hw7;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class SampleTXT {
	public static void main(String[] args) throws IOException {
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
		}
	}
}
