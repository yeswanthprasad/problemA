package exam;

import java.io.*;
import java.util.Scanner;

public class ProblemB {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		String b;
		try {
			String keyword = "problem";

			while ((s = br.readLine()) != null) {
				b = s.toLowerCase();
				if (b.matches(".*"+keyword+".*"))
					System.out.println("yes");
				else
					System.out.println("no");

			}
		} catch (NumberFormatException nfe) {
			System.err.println("Invalid Format!");
		}
	}
}
