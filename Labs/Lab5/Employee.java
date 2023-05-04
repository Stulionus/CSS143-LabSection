package Labs.Lab5;/*
 * Employee.java - Abstract
 * This is the superclass of all workers in this company
 *   All employees must have a name and social security number. 
 */

//notice the abstract keyword? That prevents us from making objects of this type!
public abstract class Employee {
	private String name;
	private int social;
	
	public Employee() {
	}
	
	public Employee(String newName, int newSocial) {
		name = newName;
		social = newSocial;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSocial() {
		return social;
	}
	public void setSocial(int social) {
		this.social = social;
	}
	

	public abstract double calculateWeeklyPay();

	/*
	Questions
    What methods are polymorphic in the Employee Hierarchy?
    Calculate Weekly Pay is the only polymorphic method.

    How could we build a method like getRandShape() above but for use with Employees?

	public Shape getRandEmployee() {
			Employee retVal = null;
			final String name = need to write a function that will choose a random name
			final int social = same here but 9 random int's in a row;


			switch( ( int )(Math.random() * 4) ) {
		case 0: 	retVal= Consultant..
			break;
		case 1: 	retVal = PermamentHire..
			break;

		 and so on..
	}

			return retVal;

    If we built a getRandomEmployee() method that returns various Employee subclass objects; write a few lines of code that would demonstrate late binding

	 */
	
}
