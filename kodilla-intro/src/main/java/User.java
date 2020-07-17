public class User {
    String imie;
    int wiek;

    //Konstruktor obiektu User
    public User(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }
//Metoda liczaca srednia
    public int averageAge(int value, int tableSize){
        return value/tableSize;
    }


}
//123123