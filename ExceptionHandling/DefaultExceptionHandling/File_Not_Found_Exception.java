package DefaultExceptionHandling;

import java.io.*;
import java.util.logging.FileHandler;

public class File_Not_Found_Exception {
    public static void main(String[] args) {


try {
    FileHandler f = new FileHandler("test.txt");  //it will throw an error because it is an checked or compile time exception
}

catch (FileNotFoundException   f)
{
//we have to create try and catch block at compile time for this handle this checked exception
}
catch (IOException f)
{
//here we will handle the checked exception using try
    System.out.println("now this code push on git hub");
}

/*NOTE : checked exceptions are exceptions that are checked at compile time. This means that
the compiler forces you to handle them either by catching them using a try-catch block or
 by declaring them using the throws keyword in the method signature.
 There are some name of Checked Exception is : FilenotFound Exception , IO EXCEPTION , ClassNotFoundException ,
 SQL Exception etc*/

  /*checked Exception means those exception which is direct child of Exception class*/

    }
}
