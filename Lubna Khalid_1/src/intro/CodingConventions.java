package intro;
// class is a file describing a new data type
public class CodingConventions {

	//fields
	private String name;
	private String description; 
	
	/*
	//this is a special method, a "constructor"
	//notice it does not have a return type, 
	//that is because the thing it returns is an instance of  the class
	* therefore the name of a constructor must always match the name of the class.
	*/
	public CodingConventions(String name, int index) {
		//In Java fields are instantiated in a constructor.
		// there is a local variable called 'name' and a field called 'name'
		//this field persists, but the local variable data is destroyed 
		this.name = name ;
		//static reference begins with a class name
		description = introMain.DESCRIPTIONS[index];
		
	
	}

	public void doStuff() {
		//static method call always there (like your graduating year)
		System.out.println(name + description);//use a space between your operations
		System.out.println("The square root of 12 is " + Math.sqrt(12));
	}
}
