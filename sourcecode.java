package javaproject; 
import java.util.ArrayList;
import java.util.Scanner;

public class Email {

    public static void main(String[] args) {
        // create a list of email IDs
        ArrayList<String> emailList = new ArrayList<String>();
        emailList.add("dharmavarapu@example.com");
        emailList.add("tharun@example.com");
        emailList.add("kumar@example.com");
        emailList.add("bajarang@example.com");

        // prompt the user to enter an email address
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an email address to search for: ");
        String searchEmail = scanner.nextLine();

        // search for the email address in the emailList
        boolean found = false;
        for (String email : emailList) {
            if (email.equals(searchEmail)) {
                found = true;
                break;
            }
        }

        // print a message indicating whether the email address was found
        if (found) {
            System.out.println(searchEmail + " was found.");
        } else {
            System.out.println(searchEmail + " was not found.");
        }
    }

}
