import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;

public class Test{
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
       case 1:
         System.out.println("Register: ");
         System.out.print("Create a username: ");
         String username = sc.nextLine();

         //validate username
         boolean validUsername = username.contains("_") && username.length() <= 5;
         

         
     }
    }
    

    
    }
}
