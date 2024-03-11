package CA215;

public class MyClass implements MyInterface , MyInterface2 , Cloneable{
int value;

    @Override
    public  void displayYear() {
        System.out.println(MyInterface.name);
        System.out.println(MyInterface2.name);
        System.out.println("year : " +  YEAR);
        System.out.println("university: " + universityName);
        System.out.println("Campus: " + campus);
    }

    @Override
    public String toString() {
        return super.toString();
    }
    @Override
    public MyClass clone() throws CloneNotSupportedException {
        return (MyClass) super.clone();
    }
    public static void main(String[] args) throws CloneNotSupportedException {
        MyClass obj1 = new MyClass();
        obj1.value = 10;

        MyClass obj2 = obj1.clone();

        obj2.displayYear();

        System.out.println(obj1.value);
        System.out.println(obj2.value);

//        System.out.println(myClass.toString());
//
//        System.out.println("ABE".compareTo("ABE"));
//        Integer a=10;
//        Integer b=20;
//        System.out.println(a.compareTo(b));

    }


}
