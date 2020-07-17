public class RandomNumbers {
    int x = (int) Math.random();

    public static int getRandomIntegerBetweenRange(int min, int max) {
        int x = (int) (Math.random() * ((max - min) + 1)) + min;
        return x;
    }

    public int add() {

        for (int value = 0; value <= 5000;) {
            value += getRandomIntegerBetweenRange(1,30);
            System.out.println(value);
        }
        return 0;
    }

    public static class getRandomIntegerBetweenRange extends RandomNumbers {
        public getRandomIntegerBetweenRange(int i, int i1) {
            super();
        }
    }
}
//123