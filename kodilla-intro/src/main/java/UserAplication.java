public class UserAplication {
    //Tablica
    public static void main(String[] args) {
        User jacek = new User("Jacek", 21);
        User hania = new User("Hania", 43);
        User krzysztof = new User("Krzysztof", 79);
        User wojtek = new User("Wojtek", 12);
        User amelia = new User("Amelia", 17);
        User karolina = new User("Karolina", 16);
        User brajan = new User("Brajan", 3);
        User[] users = {jacek, hania, krzysztof, wojtek, amelia, karolina, brajan};
        int suma = 0;
        for (int i = 0; i < users.length; i++) {
            suma = suma + users[i].wiek;
            i++;
        }
        System.out.println(jacek.averageAge(suma,users.length));
        for(User user:users){
            if (user.wiek < jacek.averageAge(suma,users.length)){
                System.out.println(user.imie + " " + "Jego wiek jest niższy od średniej");
            }
        }
    }
}
//123123