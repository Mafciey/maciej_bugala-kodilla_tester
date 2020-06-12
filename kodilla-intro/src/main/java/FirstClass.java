public class FirstClass {
    public static void main(String[] args) {


        Notebook notebook = new Notebook(600, 1000, 2016);
        System.out.println(notebook.weight + "g " + notebook.price + " " + notebook.year + " year");
        notebook.checkPrice();
        notebook.checkWeight();
        notebook.checkYear();
        notebook.checkProfitability();
        Notebook heavyNotebook = new Notebook(2000, 2000, 2020);
        System.out.println(heavyNotebook.weight + "g " + heavyNotebook.price + " " + heavyNotebook.year + " year");
        heavyNotebook.checkPrice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkYear();
        heavyNotebook.checkProfitability();
        Notebook oldNotebook = new Notebook(1200, 500, 2009);
        System.out.println(oldNotebook.weight + "g " + oldNotebook.price + " " + oldNotebook.year + " year");
        oldNotebook.checkPrice();
        oldNotebook.checkWeight();
        oldNotebook.checkYear();
        oldNotebook.checkProfitability();
    }
}
