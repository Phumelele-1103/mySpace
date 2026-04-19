import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class WorkoutApp{
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    boolean isOpen = true;

    while(isOpen){
      System.out.println("Welcome. A sweat a day keeps the doctor away");
      System.out.println("Main menu:");
      System.out.println("1. Sign up");
      System.out.println("2. Sign in");
      System.out.println("3. Exit");
      System.out.print("Select an option: ");

      int option = sc.nextInt();
      sc.nextLine();

      switch(option){
        case 1:
          //create username
          System.out.print("Step 1, Enter email address: ");
          String username = sc.nextLine();
          boolean validUsername = username.matches(".*[@gmail.com @icloud.com @yahoo.com @email @outlook].*");

          while(!validUsername){
            System.out.println("Enter valid email address(e.g xxx@gmail.com)!")
            System.out.print("Username: ");
            username = sc.nextLine();
            validUsername  username.matches(".*[@gmail.com @icloud.com @yahoo.com @email @outlook].*");
          }
          System.out.println("Username successfully captured!");
          int uniqueID = random.nextInt(1000, 7000);
          String username = email.substring(0, email.indexOf("@"));
          System.out.println("Your username will be: " + username + uniqueID);
          break;

          
          

          
          
          
      }
    }
  }
}
