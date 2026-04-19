import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class PROG5121P1{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    ArrayList<Login> users = new ArrayList<>();
    boolean isRunning = true;

    System.out.println("Hello, welcome to the ChatApp.");
    while(isRunning){
      System.out.println("Main Menu: ");
      System.out.println("1. Register.");
      System.out.println("2. Login.");
      System.out.println("3. Exit.");
      System.out.print("Choose an option: ");

      int choice = sc.nextInt();
      sc.nextLine();

     switch(choice){
      //prompt user to create account
        case 1: //register
         System.out.print("To register, create a username: ");
         String username = sc.nextLine();

         //validate username
         boolean validUsername = username.contains("_") && username.length() <= 5;
         while(!validUsername){
            System.out.println("Username must contain an underscore(_) and not longer than 5 characters");
            System.out.print("Create a username: ");
            username = sc.nextLine();
            validUsername = username.contains("_") && username.length() <= 5;     
         }
             
            System.out.println("Username captured!");

            System.out.print("Create a password");
            String password = sc.nextLine();
            boolean validPassword = password.matches(".*[A-Z].*") &&
                                    password.matches(".*//d.*") &&
                                    password.matches(".*[ @ # $ & * { } < > ! ? / ' ^ _ ~].*") &&
                                    password.length() >= 8;
            while(!validPassword){
                System.out.println("Password should be atleast 8 characters, contain a number and a special character");
                System.out.print("Create a password: ");
                password = sc.nextLine();
                validPassword = password.matches(".*[A-Z].*") &&
                                    password.matches(".*//d.*") &&
                                    password.matches(".*[ @ # $ & * { } < > ! ? / ' ^ _ ~].*") &&
                                    password.length() >= 8;   
            }

            System.out.println("Password captured!");

            //Ask for cellphone number
            System.out.println("Enter your South African cellphone number: Format +27xxxxxxxxx.");
            System.out.print("(+2)");
            String cellNumber = sc.nextLine();
            String regex = "\\+27[6-8]\\{8}";
             
            while(!cellNumber.matches(regex)){
                System.out.println("Enter a valid South African cellphone number!");
                cellNumber = sc.nextLine();
                regex = "\\+27[6-8]\\{8}";
            }

            System.out.println("Cellphone number captured");

            //Validate if user details
            //use method to get user details
            //prompt user to log in
            break;
         case 2: //Login
            System.out.println("Enter username and password to login.");
            System.out.print("Username: ");
            String username = sc.nextLine();
            //Validate user data if it exists on the database
            //use method
         
         } 
  } 
}
