public class LeapYear {
    public static void main(String[] args)
    {int presentYear=2020;
     if(presentYear % 4 == 0 && presentYear % 100 != 0)
     { System.out.print("Rok jest przestępny");}
     else
     { System.out.print("Rok nie jest przestępny");}
}}
