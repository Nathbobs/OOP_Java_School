import java.util.Scanner;

public class SelfTest2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String name;
        String greeting1;
        String greeting2;
        String uName;
        name = "nathaniel";
        greeting1 = "Hello" ;
        greeting2 = "nice to meet you";
        uName = name.toUpperCase();
        System.out.println(greeting1 + " " + name + " " + greeting2);
        System.out.println(name.length());
        System.out.println(name.equals(uName));
        System.out.println(name.equalsIgnoreCase(uName));
        
    }
}
