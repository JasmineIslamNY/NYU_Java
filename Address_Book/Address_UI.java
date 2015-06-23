import java.io.*;

public class Address_UI 
{

	public static void main(String[] args) 
	{
		
		//Address works = new Address("Islam");
		//System.out.print(works);


		try 
		{
			InputStreamReader	kbd		= new InputStreamReader(System.in);	 
			BufferedReader		kbdBuf		= new BufferedReader(kbd);		  	         

	      		while(true)
	      		{
				System.out.println("Search the address book!");
				System.out.println("Enter whole or partial last name please: (enter to cancel) ");

				String input = kbdBuf.readLine();				

				if (input.equals(""))						
		      			System.exit(0);	
									
				//Address lastName = new Address(input);
				//System.out.print(lastName);
				//screenBuf.println("You entered: " + input);			
				//screenBuf.flush( );	

													
				Address matchedRecords = new Address(input);

				for ( String[] record : (matchedRecords.getSearchResult()) )
				{
					if (record[0] == null)
					{
						System.out.println("*****************************************");
						System.out.println("No match found");
						System.out.println("*****************************************");
						System.out.println("");	
						break;
					}
					System.out.println("*********************************************************************");	
					System.out.print("Name: "+record[1]+" "+record[0]+"\n");
					System.out.print("Address: "+record[2]+", "+record[3]+", "+record[4]+" "+record[5]+"\n");
					System.out.print("Phone Number: "+record[6]+"\n");
					System.out.println("");	
				} 
				//System.out.print(matchedRecords);
				//screenBuf.println("You entered: " + input);						

			
		      	}									
		}
		catch (IOException e)							
		{
	      		System.err.println(e);						
		}									
      	}
}


