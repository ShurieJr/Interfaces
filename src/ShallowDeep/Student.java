package ShallowDeep;

public class Student implements Cloneable{
    private String name;
    private Address address; /// reference type

    public Student(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    //clone method
    @Override
    protected Object clone() throws CloneNotSupportedException {
        //return super.clone();  //shallow copy

        //deep copy
        Student copied = (Student) super.clone();
        copied.address = new Address(this.getAddress().getCity());
        return copied;
    }
}
