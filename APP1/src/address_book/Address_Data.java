package address_book;
import java.io.*;
import java.util.*;

class Address_Data
{
	private String [] address;
	
	Address_Data()
	{
		try 
		{
			File inFile = new File(“~/Documents/programming/java/NYU_Java/APP1/bin/address_database.txt”); 	//open file for reading
			FileReader openFile  = new FileReader(inFile); 	//open file for reading
			BufferedReader inBuffer  = new BufferedReader(openFile);									//buffer the input
			address = new String[infile.length()];
		
			int i = 0;
		
			while(true)
			{
				String input = inBuffer.readLine( );		//read a line
		
				if (input == null)				//if input is null → end of file 
					break;
		
				address[i++] = input;				//load address array with file
			}
			inFile.close( );

		}
		catch (FileNotFoundException e)			//catch if input file does not exist
		{
			System.err.println(“File not found ” + e );		//print exception message
		}
		catch (IOException f)					//catch all other I/O exceptions
		{
			System.err.println(f);
			e.printStackTrace(System.err);			//print program trace to error stream 
		}
	}
	public String [] getAddress()
	{
		return (address);
	}
		
	public String toString()
	{
		String data = Arrays.toString(address);
		return (data);
	}
	
}
