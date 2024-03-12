package CA214;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class shallowcopy implements Cloneable {
    private String name;
    private ArrayList<String> colors; // reference type
    private Address address;  // reference type
    public shallowcopy(String name, ArrayList<String> colors , Address address) {
        this.name = name;
        this.colors = colors;
        this.address = address;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<String> getColors() {
        return colors;
    }

    public void setColors(ArrayList<String> colors) {
        this.colors = colors;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public shallowcopy clone() throws CloneNotSupportedException {
         shallowcopy copied = (shallowcopy) super.clone();
         copied.address = new Address(this.getAddress().getCity());
         copied.colors = new ArrayList<>(this.getColors());

         return copied;
         //return (shallowcopy) super.clone(); // shallow copy
    }
}
