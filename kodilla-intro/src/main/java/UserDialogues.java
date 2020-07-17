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
    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true){
            System.out.println("Select Calculation A-Add, S-Substract, D-Divide, M-Multiply : ");
            String calc = scanner.nextLine().trim().toUpperCase();
            switch (calc){
                case "A" : return "ADD";
                case "S" : return "SUB";
                case "D" : return "DIV";
                case "M" : return "MUL";
                default:
                    System.out.println("Wrong calculation. Try again.");
            }
        }
    }
    public static int getValue(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int val = scanner.nextInt();
        return val;
    }
}
