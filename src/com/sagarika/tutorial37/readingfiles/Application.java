package com.sagarika.tutorial37.readingfiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {

		File file = new File("test.txt");

		BufferedReader br = null;
		try {
			FileReader fr = new FileReader(file);
			br = new BufferedReader(fr);

			String line;

			while ((line = br.readLine()) != null) {

				System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found");
		} catch (IOException e) {
			System.out.println("unable to read file" + file.toString());
		}

		try {
			br.close();
		} catch (IOException e) {
			System.out.println("Unable to close file " + file.toString());
		} catch (NullPointerException e) {
			// file probably never opened
		}
	}

}
