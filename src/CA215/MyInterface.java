package CA215;

public interface MyInterface {
    //all variables - public final static
   public static final int YEAR = 2024;
   String name = "interface1";

    //ALL METHODS - PUBLIC ABSTRACT
    public abstract void displayYear() ;

    public static void display(){
        System.out.println("year: " + YEAR);
    }
}
