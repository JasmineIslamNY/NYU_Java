public class Hello				// create a class (a program) called Hello
{						// this class has public access

        public static void main(String[ ] args)  	// create a method called main (the main method)
        {						// it also has public access
						// it is a static method, or a method of the class
						// (i.e. not a method belonging to one of its objects)
						// it takes a String array of many arguments
						// it returns void (i.e. nothing)

	String name;				// define a variable called name

	name = "Sam Sultan";			// assign a value to the variable

	System.out.print("Hello " +  name + "\n");	// print out “Hello” and the variable value 
						// using the System class, the out static field of that class
						// and the print( ) method of the out field

       }						// end the method
}						// end the class
