package ShallowDeep;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("Mogadishu");
        Student original = new Student("Mohamed" , address);
        Student copied =(Student) original.clone();

        //change
        copied.setName("Ali");
        copied.getAddress().setCity("Kismaayo");


        System.out.println("original:");
        System.out.println("name: " + original.getName());
        System.out.println("address: " + original.getAddress().getCity());
        System.out.println("-------------------------");

        System.out.println("Copied:");
        System.out.println("name: " + copied.getName());
        System.out.println("address: " + copied.getAddress().getCity());


    }
}
