import java.util.Scanner;

public class Colors {
    public static String getUserColor() {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("What is the first letter of the color that you think of?: ");
            String colo = scanner.nextLine().trim().toUpperCase();
            switch (colo){
                case "B" : return "Blue";
                case "R" : return "Red";
                case "P" : return "Purple";
                case "Y" : return "Yellow";
                case "V" : return "Violet";
                case "A" : return "Amaranth";
                default:
                    System.out.println("I was to lazy to add this color sorry.");
            }
        }
    }
    public static String color(){
        String userSelectedColor = Colors.getUserColor();
                String result;
        switch (userSelectedColor){
            case "B" :
                result = "Blue";
            case "R" :
                result = "Red";
            case "P" :
                result = "Purple";
            case "Y" :
                result = "Yellow";
            case "V" :
                result = "Violet";
            case "A" :
                result = "Amaranth";

        }
        return userSelectedColor;
    }

    public static void main(String[] args) {
        Colors colorSelected = new Colors();
        String result = colorSelected.color();
        System.out.println("Color: " + result);
    }
}

