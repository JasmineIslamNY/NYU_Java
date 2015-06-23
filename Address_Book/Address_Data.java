import java.io.*;
import java.util.*;

class Address_Data
{
	private String [][] address;
	
	Address_Data()
	{
		try 
		{
			File inFile = new File("./address_database.txt"); 	
			FileReader openFile  = new FileReader(inFile); 	
			BufferedReader inBuffer  = new BufferedReader(openFile);				//buffer the input
			
			int size = (int) inFile.length();
			String [] temp_address = new String[size];
		
			int i = 0;		
			while(true)
			{
				String input = inBuffer.readLine();		
		
				if (input == null)				
					break;
		
				temp_address[i++] = input;				
			}
			openFile.close();
			
			//copy temp array to final array while breaking apart each record into it's own array
			
			address = new String[i][7];
			int j = 0;
			for (String record : temp_address)
			{
				if (record == null)
					break;
				String[] words = record.split(",");
				for (int k=0; k<=6; k++)
				{
					address[j][k] = words[k];
				} 
				j++;
			}

		}
		catch (FileNotFoundException e)			
		{
			System.err.println("File not found " + e);		
		}
		catch (IOException f)					
		{
			System.err.println(f);
			f.printStackTrace(System.err);			
		}
	}
	public String [][] getAddress()
	{
		return (address);
	}
		
	public String toString()
	{
		String data = Arrays.toString(address);
		return (data);
	}
	
}
