package Introduction;

public class Thread {

    public interface DefaultExceptionHandler//here we are creating inter face im a class

    {
        public abstract void defaultexceptionhandler(Throwable t1 , Thread th);
        // so this is a interface defaultexceptionhandler method which all alwasys take two parameter
        //first is throwable class type object and second is thread class type object
    }
}
