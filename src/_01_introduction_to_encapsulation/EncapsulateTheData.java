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
	public int getItems() {
	      if(itemsReceived<0) {
	    	  return 0;
	      }
	      else {
	    	  return itemsReceived;
	      }
	   }
	public float getDegrees() {
		if(0.0 <= degreesTurned && degreesTurned <= 360.0) {
			return degreesTurned;
		}
		else {
			return 0;
		}
	}
	public String getSpaces() {
		if(nomenclature.length() > 0) {
			return nomenclature;
		}
		else {
			return " ";
		}
	}
	public Object getObj() {
		//if(memberObj)
	}
	//2. Create a new JUnit Test case and write tests to verify that 
	//   the member variables' getters and setters are working
	
	private int itemsReceived; //must not be negative. All negative arguments get set to 0.
	private float degreesTurned; //must be locked between 0.0 and 360.0 inclusive.
	private String nomenclature = " "; //must not be set to a blank string. Blank Strings get set to a space
	private Object memberObj;  //must not be a String.  If it is a String, set it equal to a new Object();
	
	public static void main(String[] args) {
		
	}
}
