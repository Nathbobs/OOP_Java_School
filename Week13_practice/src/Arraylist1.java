import java.util.ArrayList;

public class Arraylist1 {

    public static void main(String[] args) {

        System.out.println("Hello world!");
        ArrayList<String> list = new ArrayList<String>(20);
        list.add("Hello");
        list.set(0,"How are you?");
        System.out.println(list.get(0));
        System.out.println(list.size());

        System.out.println(list.isEmpty());
        System.out.println();


    }

}