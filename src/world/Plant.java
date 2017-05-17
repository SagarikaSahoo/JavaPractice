package world;

public class Plant {
	
	// --bad practice--
		public String name;
		//acceptable
		public final static int id = 8;
	
		protected String size;
		
		private String type;
		
		int height;
		
	public Plant(){
		this.size = "Medium";
		this.name = "i am busy";
		this.type = "frog";
		this.height = 5;
	}

}
