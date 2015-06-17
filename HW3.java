//*****************************************************************************
// Name: Jasmine Islam 
// Homework for Section 3                       
//*****************************************************************************

public class HW3	
{
    public static void main(String[] args) {
	
	System.out.println("Name: Jasmine Islam");
	System.out.println("Homework: 3");
	System.out.println("");

	
    	multipTable(10, 10); //calling the multipTable method with integer literals
	
	int maxRow = (int) ( (Math.random() * 10) + 1);  //creating a random integer between 1 and 10
	int maxCol = (int) ( (Math.random() * 10) + 1);  //creating a random integer between 1 and 10
	
	multipTable(maxRow, maxCol); 

    }


    static void multipTable(int maxRow, int maxCol) {

	/** 
	Method multipTable creates a multiplication table with column and row headers. 
	@author 	Jasmine Islam
	@param 	maxRow 	The max row parameter
	@param 	maxCol	The max column parameter
	@return	void	no return for this method 
	*/

	System.out.println("Printing multiplication table with " + maxRow + " row(s) & " + maxCol + " column(s):");
	System.out.println("");

	for(int row = 0; row <=maxRow; row++) {
		
		for(int col = 0; col <=maxCol; col++) {
			if (row ==0 && col==0)
				System.out.print("\t");
			else if (row ==0 && col!=0)
				System.out.print("<" + col + ">" + "\t");
			else if (row !=0 && col==0)
				System.out.print("<" + row + ">" + "\t");
			else 
				System.out.print(" " + (row * col) + "\t");
		}
		System.out.println("");
	}
	System.out.println("");
	System.out.println("");
    }
}
