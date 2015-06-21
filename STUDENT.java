//*****************************************************************************
// Name: Jasmine Islam 
// Homework for Section 5                     
//*****************************************************************************

//import  java.util.Arrays;

public class STUDENT	
{
	private static int classNumber = 9226;
	private static String className = "Java 2 Week Summer Intensive";
	private static String instructor = "Sam Sultan";
	private static int studentCount = 0;
	private int studentID;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String state;
	private String email;
	private String phone;
	private String emergencyName;
	private String emergencyNumber;	

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


	public int getClassNumber()
	{
		return (classNumber);
	}
	public void setClassNumber(int number)
	{
		classNumber = number;
	}


	public int getClassNumber()
	{
		return (classNumber);
	}
	public void setClassNumber(int number)
	{
		classNumber = number;
	}


	public int getClassNumber()
	{
		return (classNumber);
	}
	public void setClassNumber(int number)
	{
		classNumber = number;
	}


	public int getClassNumber()
	{
		return (classNumber);
	}
	public void setClassNumber(int number)
	{
		classNumber = number;
	}


	public int getClassNumber()
	{
		return (classNumber);
	}
	public void setClassNumber(int number)
	{
		classNumber = number;
	}


	public int getClassNumber()
	{
		return (classNumber);
	}
	public void setClassNumber(int number)
	{
		classNumber = number;
	}


	public int getClassNumber()
	{
		return (classNumber);
	}
	public void setClassNumber(int number)
	{
		classNumber = number;
	}


	public int getClassNumber()
	{
		return (classNumber);
	}
	public void setClassNumber(int number)
	{
		classNumber = number;
	}


	public int getClassNumber()
	{
		return (classNumber);
	}
	public void setClassNumber(int number)
	{
		classNumber = number;
	}


	public int getClassNumber()
	{
		return (classNumber);
	}
	public void setClassNumber(int number)
	{
		classNumber = number;
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
