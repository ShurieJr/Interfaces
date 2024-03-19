package CA215.shallowDeepCopy;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("Mogadishu!");
        Person original = new Person("Abdullahi" , address);
        //clone
        Person copied = (Person) original.clone();

        copied.setName("Ali omar!");
        copied.getAddress().setCity("kismaayo");

        System.out.println("original name: " + original.getName());
        System.out.println("original address: " + original.getAddress().getCity());
        System.out.println("-----------------");
        System.out.println("copied name: " + copied.getName());
        System.out.println("copied address: " + copied.getAddress().getCity());

    }

}
