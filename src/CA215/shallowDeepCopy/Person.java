package CA215.shallowDeepCopy;

public class Person implements Cloneable{
    //variables
  private String name;
   private Address address; // reference type

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        //Deep copy
        Person copied = (Person) super.clone();
        copied.address = new Address(this.getAddress().getCity());
        return copied;
//        return super.clone();  //shallow copy
    }
}
