package arrays;

public class Person {
	
	public static final String[] FIRST_START = {"Chr","M","L","Gr","Ph","B","Th","Ja","St"};
	public static final String[] FIRST_MIDDLE = {"isti","icha","era","eta","ala","ina","are","ell","eph"};
	public static final String[] FIRST_END = {"","na","n","r","tian","s","rs","mp","les"};
	
	
	public static final String[] LAST_START = {"Tr","Br","L","Gr","Sh","B","Th","Kh","Fe"};
	public static final String[] LAST_MIDDLE = {"om","o","an","ola","et","e","is","eur","ali"};
	public static final String[] LAST_END = {"","son","ers","nie","tian","rian","ston","ck","sk"};
	private String firstName;
	 private String lastName;
	private Borough home;
	public Person (String first, String last, Borough home){
		this.firstName = first;
		this.lastName = last;
		this.home = home;
	}
	public String toString() {
		return "My name is " + firstName+ " "+ lastName+ " and I live in "+ home + "." ;
		
		
	}

}
