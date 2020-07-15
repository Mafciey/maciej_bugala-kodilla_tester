public class RandomNumbersApplication {
    public static void main(String[] args) {
        RandomNumbers liczba = new RandomNumbers.getRandomIntegerBetweenRange(1,30);
        int suma = liczba.add();
        System.out.println(suma);



    }
}