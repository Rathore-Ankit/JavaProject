package Introduction;

import java.lang.reflect.UndeclaredThrowableException;
import java.util.Scanner;

public class connection{


    public static void getage()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your age : ");
        int age = sc.nextInt();
        try {
            if (age < 18) {
                throw new YoungerageException("you are not eligible for voting");
            } else {
                System.out.println("voting succes");
            }
        }
        catch (YoungerageException e)
        {
            e.printStackTrace();
        }
    }

    public static void main (String args [])
    {
        getage();
    }
}

class YoungerageException extends RuntimeException
{
    YoungerageException(String msg)
    {
        super(msg);
    }
}
