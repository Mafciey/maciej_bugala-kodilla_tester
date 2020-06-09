public class LeapYear {
    public static void main(String[] args) {
        //Inaczej inaczej= new Inaczej();
        //inaczej.getCountOfRandomNumber(21);
        //Math.abs();
        //Math.abs();
//        Inaczej.getCountOfRandomNumber(21);
        int presentYear = 20;
        if (presentYear % 4 == 0 && presentYear % 100 != 0 || presentYear % 400 == 0) {
            System.out.print("Rok jest przestępny");
        } else {
            System.out.print("Rok nie jest przestępny");
        }
    }
}
