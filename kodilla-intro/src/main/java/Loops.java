public class Loops
{
    public static void main(String[] args)
    {
        int wynik=0;
        int[] numerki = new int[]{1,2,3,4,5,6,7,8,9};

    for (int i=0; i<numerki.length; i++) {
        wynik = wynik + numerki[i];
        System.out.println(wynik);
    }
    }
}



