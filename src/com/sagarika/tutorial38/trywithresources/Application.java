package com.sagarika.tutorial38.trywithresources;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {

	public static void main(String[] args) {
		File file = new File("try.txt");
		
	  try(BufferedReader br = new BufferedReader(new FileReader(file))){
	  String line;
	  
	  while((line = br.readLine()) != null){
		  System.out.println(line);
	  }
	  }catch (FileNotFoundException e){
		  System.out.println("can't find file " +file.toString());
	  }catch (IOException e) {
		  System.out.println("unable to read file" + file.toString());
	  }
	}

}
