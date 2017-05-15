package com.sagarika.tutorial12;

public class Application {

	public static void main(String[] args) {
		
		int[][] grid = {
				{3,2,456},
				{1,2},
				{23,45,4}
		};
		System.out.println(grid[0][2]);
		System.out.println(grid[1][1]);
		
		String[][] word = new String[1][2];
		word[0][1] = "Hello there";
		
		System.out.println(word[0][1]);
		
		for(int row = 0; row<word.length;row++){
			for(int col =0;col<word[row].length;col++){
				
				System.out.println(word[row][col]);
			}
			System.out.println();
		}
	}

}
