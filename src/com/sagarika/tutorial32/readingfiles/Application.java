package com.sagarika.tutorial32.readingfiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Application {

	public static void main(String[] args) throws FileNotFoundException {

		String fileName = "E:/JavaPracticeWS/Tutorial/src/com/sagarika/tutorial32/readingfiles/example.txt";

		File textfile = new File(fileName);

		Scanner in = new Scanner(textfile);

		int value = in.nextInt();
		System.out.println("Read value: " + value);

		in.nextLine();

		int count = 2;
		while (in.hasNextLine()) {
			String line = in.nextLine();

			System.out.println(count + ":" + line);
			count++;
		}
		in.close();

	}

}
