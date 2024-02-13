import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("what is the first contact name?");
        String userInputName = input.nextLine();
        System.out.println("what is the first contact's email address?");
        String userInputEmail = input.nextLine();
        ContactInfo person1 = new ContactInfo(userInputName, userInputEmail);
        System.out.println(person1);
        System.out.println("What contact do you want to find?");
        String userInput = input.nextLine();


    }
}