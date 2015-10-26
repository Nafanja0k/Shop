package person;
class Person {
	private String firstName;
	private String lastName;
	private double id;
	/** initializeer for id generator*/
	
	static private double genId=1;
	
	public Person (){
		this("n/a", "n/a");
	}
	public Person (String theFirstName, String theLastName){
		firstName = theFirstName;
		lastName = theLastName;
		id = getNextId();
	}
	
	/** Generates new unique id for person
	*/
	static public double getNextId(){
		return ++genId;
	}
}
