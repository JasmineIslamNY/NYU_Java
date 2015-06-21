//*****************************************************************************
// Name: Jasmine Islam 
// Homework for Section 5                     
//*****************************************************************************

//import  java.util.Arrays;

public class STUDENT	
{
	private static 	int 		classNumber = 9226;
	private static 	String 		className = "Java 2 Week Summer Intensive";
	private static 	String 		instructor = "Sam Sultan";
	private static 	int 		studentCount = 0;
	private 	int 		studentID;
	private 	String 		firstName;
	private 	String 		lastName;
	private 	String 		address;
	private 	String 		city;
	private 	String 		state;
	private 	String 		email;
	private 	String 		phone;
	private 	String 		emergencyName;
	private 	String 		emergencyNumber;	

	public int getClassNumber()
	{
		return (classNumber);
	}
	public void setClassNumber(int number)
	{
		classNumber = number;
	}


	public String getClassName()
	{
		return (className);
	}
	public void setClassName(String text)
	{
		className = text;
	}


	public String getInstructor()
	{
		return (instructor);
	}
	public void setInstructor(String text)
	{
		instructor = text;
	}

	public int getStudentCount()
	{
		return (studentCount);
	}
	/** don't want the ability to set studentNumber
	public void setStudentCount(int number)
	{
		studentCount = number;
	} 
	*/


	public int getStudentID()
	{
		return (studentID);
	}
	public void setStudentID(int number)
	{
		studentID = number;
	}


	public String getFirstName()
	{
		return (firstName);
	}
	public void setFirstName(String text)
	{
		firstName = text;
	}


	public String getLastName()
	{
		return (lastName);
	}
	public void setLastName(String text)
	{
		lastName = text;
	}


	public String getAddress()
	{
		return (address);
	}
	public void setAddress(String text)
	{
		address = text;
	}


	public String getCity()
	{
		return (city);
	}
	public void setCity(String text)
	{
		city = text;
	}


	public String getState()
	{
		return (state);
	}
	public void setState(String text)
	{
		state = text;
	}


	public String getEmail()
	{
		return (email);
	}
	public void setEmail(String text)
	{
		email = text;
	}


	public String getPhone()
	{
		return (phone);
	}
	public void setPhone(String text)
	{
		phone = text;
	}


	public String getEmergencyName()
	{
		return (emergencyName);
	}
	public void setEmergencyName(String text)
	{
		emergencyName = text;
	}


	public String getEmergencyNumber()
	{
		return (emergencyNumber);
	}
	public void setEmergencyNumber(String text)
	{
		emergencyNumber = text;
	}



	STUDENT (String fname, String lname)
	{
		firstName 	= 	fname;
		lastName	= 	lname;
		studentCount 	+= 	1;
		studentID 	= 	studentCount+999;
	}

	STUDENT (String firstName, String lastName, String address, String city, String state, String email, String phone, String emergencyName, String emergencyNumber) 
	{
		this(firstName, lastName);
		this.address 		= address;
		this.city 		= city;
		this. state 		= state;
		this. email 		= email;
		this. phone 		= phone;
		this.emergencyName 	= emergencyName;
		this. emergencyNumber 	= emergencyNumber;
	}


	public String toString()
	{
		String data =
		"Class Number: "+ classNumber + "\n" +
		"Class Name: "+ className + "\n" +
		"Instructor: "+ instructor + "\n" +
		"Student Count: "+ studentCount + "\n" +
		"Student ID: "+ studentID + "\n" +
		"First Name: "+ firstName + "\n" +
		"Last Name: "+ lastName + "\n" +
		"Address: "+ address + "\n" +
		"City: "+ city + "\n" +
		"State: "+ state + "\n" +
		"Email: "+ email + "\n" +
		"Phone: "+ phone + "\n" +
		"Emergency Name: "+ emergencyName + "\n" +
		"Emergency Number: "+ emergencyNumber + "\n";
		
		return (data);	
	}
	

	public static void main(String[] args)
	{
		STUDENT test = new STUDENT("Jasmine", "Islam");
		System.out.print(test);
	}

}
