public class AdvCalculator {
    public double calculate() {
        String userSelected = UserDialogues.getUserSelection();
        int a = UserDialogues.getValue();
        int b = UserDialogues.getValue();
        double result = 0;
        switch (userSelected) {
            case "ADD":
                result = a + b;
                break;
            case "SUB":
                result = a - b;
                break;
            case "DIV":
                result = a / b;
                break;
            case "MUL":
                result = a * b;
                break;
        }
        return result;
    }
}
