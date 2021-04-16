package testPaper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class TestIO {
	public static void main(String[] args) {
		Scanner scanner = null;
		PrintWriter  writer = null;
		try {
			scanner = new Scanner(new FileInputStream("aa.java"));
			writer = new PrintWriter(new FileOutputStream("aa.txt"));
			boolean flag = true;
			while(scanner.hasNextLine()) {
				String str = scanner.nextLine();
				if (str.contains("/*")) {
					flag = false;
				}
				if (flag && !str.contains("//")) {
					writer.println(str);
				}
				if (str.contains("*/")) {
					flag = true;
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if (scanner != null) {
				scanner.close();
			}
			if (writer != null) {
				writer.close();
			}
		}
	}

}
