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
	private Hobby hobby;
	private String nickname;
	private Person[] friends ;
	public Person (String first, String last, Borough home){
		this.firstName = first;
		this.lastName = last;
		this.home = home;
		this.nickname = createNickname(firstName);
		this.hobby = Hobby.randomHobby();
		friends = new Person[3];
	}
	/*
	 * chooses friends from People based on who is of the same class 
	 * as this instaance and who has the same hobbies.
	 */
	//------------------------------------------------------
	/*JAVA IS PASS-BY VALUE
	 * MEANING THE PARAMETERS OF A METHOD ARE JUST VALUES, NOT REFERENCES
	 * SO IF YOU CHANGED THOSE VALUES, THE ORIGINAL OBJECT IS NOT AFFECTED.
	 * IN THIS CASE, 'name' WILL NOT BE CHANGED. IN FACT NOTHING CAN CHANGE
	 * this.firstName via name.
	 */

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
		nickname = createNickname(firstName);
	}
	public static String createNickname(String name) {
		int secondVowelPsn = findSecond(name);
		String nickname = "";
		nickname = name.substring(0,secondVowelPsn);
		return nickname;
	}
	
	private static int findSecond(String word) {
		boolean foundVowel = false;
		int index = word.length();
		for(int i = 0; i< word.length();i++){
			if(word.substring(i, i+1).equals("a")||
			word.substring(i, i+1).equals("e")||
			word.substring(i, i+1).equals("i")||
			word.substring(i, i+1).equals("o")||
			word.substring(i, i+1).equals("u")) {
				if(!foundVowel) {
					foundVowel = true;
				}
				else {
					
					return i;
				}
		}
		}
		return index;
	}

	public void mingle(Person[] people) {
		for (Person p: people) {
			if(p != this) {
				
				//reassign p to the better of the first two friends: your current 
				//best friend or p
				p = betterFriend(p, friends[0]);
				
				addFriendToFirstPlace(p);
			}
		}
	}
	
	private Person betterFriend(Person p, Person q) {
		if(p == null) {
			return q;
		}
		if(q == null) {
			return p;
		}
		if(p.getClass() == this.getClass()) {
			return p;
		}
		if(q.getClass() == this.getClass()) {
			return q;
		}
		if(q.getClass() == this.getClass() && p.getClass() == this.getClass())
		{
			if(p.hobby == this.hobby) {
				return p;
			}
			else if(q.hobby == this.hobby) {
				return q;
				}
		}
		//if none of these are true, just take p
		return p; 
	}
	public void printFriend() {
		System.out.println("My name is " + firstName+" "+lastName + " and these are my friends:") ;
		for(Person f: friends) {
			if(f != null) {
				System.out.println(f);
			}
		}
	}
	/*
	 * Moves all Person in friends back one index and puts p at index 0
	 * 
	 */
	public void addFriendToFirstPlace(Person p) {
		//this loop goes backwards...
		for(int i = friends.length -1; i > 0;i--) {
			//..and moves each friend back a position
			friends[i] = friends[i-1];
			
		}
		friends[0]= p;
	}

	public String toString() { 
		return "My name is " + firstName+ " "+ lastName+ " and I live in "+ home + "."+ "I like to " + hobby + "." + "Call me " + nickname + ".";
		
		
	}

}

