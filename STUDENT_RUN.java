//*****************************************************************************
// Name: Jasmine Islam 
// Homework for Section 5                     
//*****************************************************************************

public class STUDENT_RUN	
{
	public static void main(String[] args) 
	{	
		System.out.println("Name: Jasmine Islam");
		System.out.println("Homework: 5");
		System.out.println("");
		//STUDENT test = new STUDENT("Jasmine", "Islam");
		//System.out.print(test);
    	
		STUDENT one = new STUDENT("Jasmine", "Islam");
		STUDENT two = new STUDENT("Robert", "McMilan");
		STUDENT three = new STUDENT("Mat", "Mladin", "124 Main St", "Murray Hill", "NY", "mat@mladin.com", "212-555-1212", "Julie Mladin", "212-555-2222");
		STUDENT four = new STUDENT("Mellissa", "Paris", "1 Paris Way", "Tustin", "CA", "melly@gmail.com", "201-453-4555", "Josh Hayes", "201-543-1212");
		STUDENT five = new STUDENT("Jane", "Walker", "731 Lexington Ave", "New York", "NY", "walker@texasranger.com", "646-897-4533", "Bob Tompkins", "347-412-1234");

		System.out.print(one);
		System.out.print(two);
		System.out.print(three);
		System.out.print(four);
		System.out.print(five);







	}

}