import java.io.*;
import java.util.*;

class Address_Data
{
	private	String [][]	address;
	private	int 		addrBookSize	=	0;
	private	int 		addrRecordSize	=	7;
	
	Address_Data()
	{
		try 
		{
			File inFile = new File("./addrbook"); 	
			FileReader openFile  = new FileReader(inFile); 	
			BufferedReader inBuffer  = new BufferedReader(openFile);				//buffer the input
			
			int size = (int) inFile.length();
			String [] temp_address = new String[size];
				
			while(true)
			{
				String input = inBuffer.readLine();		
		
				if (input == null)				
					break;
		
				temp_address[addrBookSize++] = input;				
			}
			openFile.close();
			
			//copy temp array to final array while breaking apart each record into it's own array
			
			address = new String[addrBookSize][addrRecordSize];
			int j = 0;
			for (String record : temp_address)
			{
				if (record == null)
					break;
				String[] words = record.split(",");
				for (int k=0; k<addrRecordSize; k++)
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

	public int getAddrBookSize()
	{
		return (addrBookSize);
	}

	public int getAddrRecordSize()
	{
		return (addrRecordSize);
	}
		
	public String toString()
	{	
		String text = new String("");
		for (String [] data : address)
		{
			text+= Arrays.toString(data) + "\n";
		}
		return (text);
	}
	
}
