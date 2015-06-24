package address_book;
import java.util.*;

class Address 
{
	private String 		searchString;
	private String [][] 	searchResult;
	private int		resultSize 	= 	0;
	private int		addrRecordSize;
	

	Address(String searchTerm)
	{
		searchString = searchTerm;
		Address_Data book = new Address_Data();
		this.addrRecordSize = book.getAddrRecordSize();
		int bookSize = book.getAddrBookSize();
		String [][] tempBook = book.getAddress();
		String [][] tempSearchResult = new String[bookSize][addrRecordSize];
		
		
		for (int i = 0; i < bookSize; i++)
		{
			if ((tempBook[i][0].toLowerCase() ).contains( searchString.toLowerCase() ) )
			{
				tempSearchResult[resultSize++] = tempBook[i];
			} 


		}

		if (resultSize > 0)
		{
			searchResult = new String[resultSize][addrRecordSize];
			for (int j = 0; j < resultSize; j++)
			{
				searchResult[j] = tempSearchResult[j];
			}
		}
		else
		{
			searchResult = new String[1][1];
			searchResult[0][0] = null;
		}

	}


	public String [][] getSearchResult()
	{
		return (searchResult);
	}

	public int getResultSize()
	{
		return (resultSize);
	}

	public int getAddrRecordSize()
	{
		return (addrRecordSize);
	}

	public String toString()
	{	
		String text = new String("");
		for (String [] data : searchResult)
		{
			text+= Arrays.toString(data) + "\n";
		}
		return (text);
	}
}