import java.sql.SQLOutput;
import java.util.Locale;

public class DataTypes {
    public static void main(String[] args) {
        //5 tipuri de date cele mai folosite;

        //String = Sir de caractere delimitate de " ";
        String marca = "Dacia"; //D+a+c+i+a (le concateneaza)
        String model = "1310";
        //va printa Dacia cu litere mari DACIA
        System.out.println(marca.toUpperCase());

        //cand e vb de stringuri ti le concateneaza deci le uneste. nu face mate
        String a="3";
        String b="4";
        System.out.println(a+b);

        //integer = NUMAR INTREG not: int
        //daca vrem sa le adune le definim ca int
        int c=3;
        int d=4;
        System.out.println(c+d);

        int anFabricatie= 1987;
        System.out.println("Anul de fabricatie este: " + anFabricatie);

        //double = numar zecimal;
        double pret = 2300.50;

        //boolean = adevarat sau fals;
        boolean inmatriculata = false;

        //char = un singur caracter #, $, d
        char nota = 'A';
    }
}
