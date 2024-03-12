package CA214;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
       ArrayList<String> colors = new ArrayList<>();
       colors.add("black");
       colors.add("white");

        Address address = new Address("Hodan");

        shallowcopy obj1    = new shallowcopy("Ali" , colors , address );
        shallowcopy obj2 = obj1.clone();

        //change
        colors.add("Green");
        obj1.setColors(colors);
        obj1.setName("Mohamed");
        obj1.getAddress().setCity("Mogadishu");


        //obj2
 ArrayList<String> newc = new ArrayList<String>();
        newc.add("yellow");
        obj2.setColors(newc);

        System.out.println("obj1 colors:");
        for(String color : obj1.getColors())
            System.out.println(color);
        System.out.println("name:" + obj1.getName());
        System.out.println("city:" + obj1.getAddress().getCity());
        System.out.println("---------------------------");

        System.out.println("obj2 colors:");
        for(String color : obj2.getColors())
            System.out.println(color);
        System.out.println("name:" + obj2.getName());
        System.out.println("city:" + obj2.getAddress().getCity());

    }
}
