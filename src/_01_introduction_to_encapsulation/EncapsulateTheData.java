package _01_introduction_to_encapsulation;

/*
 * Encapsulation is a way of protecting the data in a class from being
 * unintentionally altered from another class.
 * 
 * To encapsulate a member variable, follow these three steps:
 * 
 * 1. Make the member variable private (or protected)
 * 
 * 2. Make a getter and setter method (accessor and mutator) for the variable.
 * 
 * 3. Add restrictions to the setter method so the member variable cannot be 
 * 	  adversely altered
 * 
 * */


public class EncapsulateTheData {
	//1. Encapsulate the member variables.
	//   Add restrictions to the setters according to the comment.
	
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	private int itemsReceived; //must not be negative. All negative arguments get set to 0.
	private float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	private String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	private Object memberObj;  //must not be a String.  If it is a String, set it equal to a new Object();
	
	int getItemsReceived() {
		return itemsReceived;
	}
	void setItemsReceived(int itemsReceivedToSet) {
		if(0 > itemsReceivedToSet) {
			System.out.println("Integer must not be negative. Setting to 0.");
			this.itemsReceived = 0;
		}
		else {
			this.itemsReceived = itemsReceivedToSet;
		}
		
	}
	
	float getDegreesTurned() {
		return degreesTurned;
	}
	
	void setDegreesTurned(float degreesTurnedToSet) {
		if(degreesTurnedToSet > 0.0 && degreesTurnedToSet < 360.0 ) {
		this.degreesTurned = degreesTurnedToSet;
		}
		else {
			System.out.println("Failed. Float must be between 0.0 and 360.0.");
		}
	}
	
	String getNomenClature() {
		return nomenclature;
	}
	void setNomenClature(String nomenClatureToSet) {
		if(nomenclature.equals("")) {
			System.out.println("String must not be a blank string. Setting to a space.");
			this.nomenclature = " ";
		}
		else {
			this.nomenclature = nomenClatureToSet;
			
		}
	}
	
	Object getMemberObj() {
		return this.memberObj;
	}
	void setMemberObj(Object memberObjToSet) {
		if(memberObjToSet instanceof String) {
			System.out.println("Must not be a string. Setting to new object.");
			this.memberObj = new Object();
		}
		else {
			this.memberObj= memberObjToSet;
		}
	}
	
	
}
