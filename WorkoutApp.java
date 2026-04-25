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
          String email = sc.nextLine();
          boolean validEmail = email.matches(".*[@gmail.com @icloud.com @yahoo.com @email @outlook].*");

          while(!validEmail){
            System.out.println("Enter valid email address(e.g xxx@gmail.com)!")
            System.out.print("Ema: ");
            username = sc.nextLine();
            validEmail = email.matches(".*[@gmail.com @icloud.com @yahoo.com @email @outlook].*");
          }
          System.out.println("Email successfully captured!");
          int uniqueID = random.nextInt(1000, 7000);
          String username = email.substring(0, email.indexOf("@"));
          System.out.println("Your username will be: " + username + uniqueID);

          //ask for cellphone
          System.out.print("Step 2, enter cellphone number: ");
          String cellNumber = sc.nextLine();
          String regex = "^\\+27[6-8]\\d{8}$";
          boolean validNumber = cellNumber.matches(regex);

          while(!validNumber){
            System.out.println("Invalid format! Use +27xxxxxxxxx.");
            System.out.print("Enter a valid number: ");
            cellNumber = sc.nextLine();
            validNumber = cellNumber.matches(regex);   
          }
          System.out.println("Number captured!");
          System.out.println("Your cellphone number is: " + cellnumber + ".");

          //ask for password
          System.out.print("Step 3, create a password: ");
          String password = sc.nextLine();
          boolean validPassword = password.length() >=8 &&
                                  password.matches(".*\\d.*") &&
                                  password.matches(".*[A-Z].*") &&
                                  password.matches(".*[ @ # $ & % ].*");
          //validate password
          while(!validPassword){ 
            System.out.println("Invalid password format! Must have an uppercase, contain a atleast 1 digit and(@ # $ & %);
            System.out.print("Create a valid password: ");
            password = sc.nextLine();
            validPassword = password.length() >= 8 &&
                                  password.matches(".*\\d.*") &&
                                  password.matches(".*[A-Z].*") &&
                                  password.matches(".*[ @ # $ & % ].*");
          }
          System.out.println.("Password captured. You may now login.");

        case 2:
          System.out.println("To log in, enter username and password.");
          System.out.print("Username: ")
          username = sc.nextLine();
          //validate username
          System.out.p
          //validate password
          
            
          

          
          
          
      }
    }
  }
}
