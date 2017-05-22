package com.sagarika.tutorial39.creatingandwriting;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {
		File file = new File("writing.txt");
		
		try(BufferedWriter br = new BufferedWriter(new FileWriter(file))){
		 br.write("This is line one");
		 br.write(" this is line two");
		 br.newLine();
		 br.write("last line");
		}catch (IOException e){
			System.out.println("Unable to read file"+ file.toString());
		}

	}

}
