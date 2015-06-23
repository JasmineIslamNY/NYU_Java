//*****************************************************************************
// Name: Jasmine Islam 
// Homework for Section 5                     
//*****************************************************************************

public class STUDENT_UI	
{
	public static void main(String[] args) 
	{	
		System.out.println("Name: Jasmine Islam");
		System.out.println("Homework: 5");
		System.out.println("");
    	
		STUDENT one = new STUDENT("Jasmine", "Islam");
		STUDENT two = new STUDENT("Robert", "McMilan");
		STUDENT three = new STUDENT("Mat", "Mladin", "124 Main St", "Murray Hill", "NY", "mat@mladin.com", "212-555-1212", "Julie Mladin", "212-555-2222");
		STUDENT four = new STUDENT("Mellissa", "Paris", "1 Paris Way", "Tustin", "CA", "melly@gmail.com", "201-453-4555", "Josh Hayes", "201-543-1212");
		STUDENT five = new STUDENT("Jane", "Walker", "731 Lexington Ave", "New York", "NY", "walker@texasranger.com", "646-897-4533", "Bob Tompkins", "347-412-1234");

		System.out.println("Print the five students before changes:");
		System.out.println(one.toString());
		System.out.println(two.toString());
		System.out.println(three.toString());
		System.out.println(four.toString());
		System.out.println(five.toString());

		System.out.println("Display and change Class Name:");
		System.out.println(one.getClassName());
		one.setClassName("Java 2");
		System.out.println("Class name for Student One after change:");
		System.out.println(one.getClassName());
		System.out.println("Show that it changes for all students:");
		System.out.println("Class name for Student Four:");
		System.out.println(four.getClassName());
		
		System.out.println(" ");
		System.out.println("There are "+five.getStudentCount()+" students in the "+three.getClassName()+" class taught by Professor "+one.getInstructor());
		System.out.println(" ");
		
		System.out.println("Using setters to make some more changes for Student "+four.getFirstName()+" "+four.getLastName()+" and "+two.getFirstName()+" "+two.getLastName());	
		System.out.println(" ");	
		four.setFirstName("Melissa");
		two.setAddress("2127 33rd St");
		two.setCity("Astoria");
		two.setState("NY");


		System.out.println("Print the five students after the setter changes:");
		System.out.println(one);
		System.out.println(two);
		System.out.println(three);
		System.out.println(four);
		System.out.println(five);
	}

}