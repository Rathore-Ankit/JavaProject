import Introduction.MyUncaughtExceptionHandler;


// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Ctrl+1 with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
       Thread.currentThread().setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());

      //  Thread.currentThread().setUncaughtExceptionHandler(new MyUncaughtExceptionHandler());
       Thread.currentThread().setName("jjjj");


        //Thread.currentThread().setName("my thread");
        System.out.println("hello");
        int a = 10 / 0;

    }
}