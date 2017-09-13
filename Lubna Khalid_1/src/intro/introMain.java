package intro;//this is a package declaration
//this is class header (class declaration)
public class introMain {

	//constants (public)
	public static final String[] DESCRIPTIONS = {"is a teacher",
			"is a human being",
			"is imaginary"};
	
	public static void main(String[] args) {
		//declaration of a local variable
		//notice the use of the word 'new'
		//new must be used to call a construction 
		CodingConventions conventionsInstance = new CodingConventions("Mr Nockles",0);
		//instance method call is a individual example of CodingConventions
		conventionsInstance.doStuff();  
	}

}
