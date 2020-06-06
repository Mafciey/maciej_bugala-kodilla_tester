public class SimpleArray {
    public static void main(String[] args) {
        String[] gry = new String[]{"Left For Dead 2", "Hollow Knight", "Enter the Gungeon", "Stardew Valley", "Mario Odysey"};
        String gra = gry[3];
        System.out.println(gra);
        int numberOfElements = gry.length;
        System.out.print("Moja tablica zawiera ");
        System.out.print(numberOfElements);
        System.out.print(" elementów.");
    }
}
