package Introduction;
//this way to extends a class which have interface
public class ThreadGroup extends Thread {
    public void defaultexceptionhandler(Throwable t1 , Thread th){
        System.err.println("Exception in thread ");
        th.getClass();
        t1.printStackTrace();

    }

    public static void main(String[] args) {

        ThreadGroup t = new ThreadGroup();
        t.defaultexceptionhandler(new Throwable() ,new ThreadGroup());
    }
}
//this way to implements a interface which is created with in a class

