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

	/** 
	Method printArray takes in a string array and prints out each item in a separate line.
	Method also converts the array to a String object and prints that out.  
	@author 	Jasmine Islam
	@param 	array1 String array
	@return	void	no return for this method 
	*/

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
		firstname 	= 	fname;
		lastname	= 	lname;
		studentCount 	+= 	1;
		studentID 	= 	studentCount+999
	}

	STUDENT (String firstName, String lastName, String address, String city, String state, String email, String phone, String emergencyName, String emergencyNumber) 
	{
		this(firstname, lastname);
		this.address 		= address;
		this.city 		= city;
		this. state 		= state;
		this. email 		= email;
		this. phone 		= phone;
		this.emergencyName 	= emergencyName;
		this. emergencyNumber 	= emergencyNumber;

	}



	Public String toString()
	{
		System.out.print("classNumber: "+classNumber+" 
		className: "+ className +
		" instructor: "+ instructor +
		" studentCount: "+ studentCount +
		" studentID: "+ studentID +
		" firstName: "+ firstName +
		" lastName: "+ lastName +
		" address: "+ address +
		"city: "+ city +
		" "state: "+ state +
		" email: "+ email +
		" phone: "+ phone +
		" emergencyName: "+ emergencyName +
		" emergencyNumber: "+ emergencyNumber);	
	}
	











    static void printArray(String [] array1)    
    {

	
	
	String converted = "";
	for (String elems : array1)
	{
		System.out.println(elems); //loops through array1 and prints out each String element
		converted += elems +" ";
	}
	System.out.println(converted); 
	System.out.println("");
    }

    static String [] sortArray(String [] array2) 
    {

	/** 
	Method sortArray takes in a string array and sorts it using compareTo method. 
	@author 		Jasmine Islam
	@param 	array2 		String array
	@return	String [] 	Sorted array
	*/
		
	for (int i = 0; i < array2.length; i++)
	{
		for (int j = i+1; j < array2.length; j++)
		{
			if (array2[i].compareTo(array2[j]) > 0)		//if should ignore case, use compareToIgnoreCase 
			{
				String temp = array2[i];
				array2[i] = array2[j];
				array2[j] = temp;
			}
		}	
	}
	return array2;

    }
}
