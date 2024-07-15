package Introduction.Practice1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {
        Scanner scanner = null;
        String error=null;
        try {
            scanner=new Scanner(System.in);
            int a=scanner.nextInt();
            int b=scanner.nextInt();
            System.out.println(a/b);
        }catch (InputMismatchException e){
            error="";
            System.out.println(e.getMessage());
        }catch (ArithmeticException e){
            System.out.println("zero not allowed");
        }
    }
}
