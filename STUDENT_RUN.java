//*****************************************************************************
// Name: Jasmine Islam 
// Homework for Section 5                     
//*****************************************************************************

//import  java.util.Arrays;
public class STUDENT	
{
    public static void main(String[] args) 
    {	
	System.out.println("Name: Jasmine Islam");
	System.out.println("Homework: 5");
	System.out.println("");

	if (args.length < 3)
	{
		System.out.println("Please retry with at least 3 arguments");
		System.exit(-1);
	}
  
	System.out.println("Before the sort:");  	
	printArray(args);

	args = sortArray(args);				// String [] sorted = new String [sortArray(args)];	
	System.out.println("After the sort:");  	
	printArray(args);				//printArray(sorted);
    }


    static void printArray(String [] array1)    
    {

	/** 
	Method printArray takes in a string array and prints out each item in a separate line.
	Method also converts the array to a String object and prints that out.  
	@author 	Jasmine Islam
	@param 	array1 String array
	@return	void	no return for this method 
	*/
	
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
