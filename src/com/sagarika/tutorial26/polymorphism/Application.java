package com.sagarika.tutorial26.polymorphism;

public class Application {

	public static void main(String[] args) {
		Plant plant1 = new Plant();
		Tree tree = new Tree();
		
		Plant plant2 = tree;
		plant2.grow();
		
		tree.shedleaves();
		
       doGrows(tree);
	}
	public static void doGrows(Plant plant){
		plant.grow();;
	}

}
