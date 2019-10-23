import java.util.Scanner;

public class Main {
    public static void main (String [] args){
        Scanner key = new Scanner(System.in);
        System.out.println("First Name");
        String first = key.next();
        System.out.println("Last name");
        String last = key.next();
        System.out.println("House Number");
        String houseNum = key.next();
        System.out.println("Street Name");
        String streetName = key.next();
        System.out.println("Street Type");
        String streetType = key.next();
        System.out.println("City");
        String city = key.next();

        System.out.println("First: " + first + " Last: " + last +  " House Number: " + houseNum);
        System.out.println("Street Name: " + streetName +" Street Type: " + streetType + " City: " + city);
    }
}
