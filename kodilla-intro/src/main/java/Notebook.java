public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;
    }

    public void checkPrice() {
        if (this.price <= 600) {
            System.out.println("The Notebook is very cheap");
        } else if (this.price > 600 && this.price <= 1000) {
            System.out.println("The price is good");
        } else if (this.price > 1000) {
            System.out.println("This notebook is expensive");
        }
    }

    public void checkWeight() {
        if (this.weight <= 700) {
            System.out.println("This notebook is light");
        } else if (this.weight > 700 && this.weight <= 1500) {
            System.out.println("This notebook is not that heavy");
        } else if (this.weight > 1500) {
            System.out.println("This notebook is very heavy");
        }
    }

    public void checkYear() {
        if (this.year <= 2014) {
            System.out.println("This notebook is very old");
        } else if (this.year > 2014 && this.year < 2018) {
            System.out.println("This notebook is not new");
        } else if (this.year > 2018) {
            System.out.println("This notebook is brand new");
        }
    }
        public void checkProfitability () {
            if (this.year < 2010 && this.price > 450) {
                System.out.println("This notebook is old and too expensive");
            } else if (this.year < 2010 && this.price <= 450) {
                System.out.println("This notebook is old but the price is fair");
            } else if (this.year > 2010 && this.year < 2018 && this.price > 1200) {
                System.out.println("This notebook is not new and the price is too high");
            } else if (this.year > 2010 && this.year < 2018 && this.price <= 1200) {
                System.out.println("This notebook is not new but it's worth its price");
            } else if (this.year > 2018 && this.price > 3000) {
                System.out.println("This notebook is brand new but it's not worth that price");
            } else if (this.year > 2018 && this.price <= 3000) {
                System.out.println("This notebook is brand new and it's definitely worth its price");
            }
        }

    }