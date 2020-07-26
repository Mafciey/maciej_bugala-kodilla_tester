public class Application {
    public static void main(String[] args) {
        Adam adam = new Adam("Adam", 13, 123);

        verifyUserParemeters(adam);

    }

    private static void verifyUserParemeters(Adam adam) {
        if (adam.getName() != null) {
            if (adam.getAge() > 30 && adam.getHeight() > 160) {
                System.out.println("User is older than 30 and higher then 160cm");
            } else {
                System.out.println("User is younger than 30 or lower than 160cm");
            }
        }
    }

}