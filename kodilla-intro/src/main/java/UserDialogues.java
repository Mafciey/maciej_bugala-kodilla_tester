import java.util.Scanner;

public class UserDialogues {
    public static String getUserName(){
        Scanner scaner = new Scanner(System.in);
        while(true){
            System.out.println("Enter Your Name: ");
            String name = scaner.nextLine().trim();
            if (name.length() >= 2){
                return name;
            }
            System.out.println("Name is too short");
        }
    }
}
