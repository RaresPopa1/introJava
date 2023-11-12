public class Functii {
    //nu putem folosi spatii in nume
    //nu putem defini o functie in alta functie (nu pot instla firefox in chrome)
    // functie = logica delimitata care poate fi refolosita

    // o functie simpla care ne printeaza ceva pe ecran
    // nu ne da nici un raspuns
    // nu are parametri
    public static void printGreeting(){ //public, ca se poate apela din orice clasa, static, ca nu lucram cu programare pe baza de obiect, void, ca nu returneaza nimic
        System.out.println("Buna ziua! Bine ati venit!");
    }

    // o functie simpla care saluta clientul in f de nume
    // nu ne da nici un raspuns
    // are nevoie de parametri
    public static void printGreetingByName(String nume, String prenume){
        System.out.println("Buna ziua " + nume + " " + prenume);
    }

    // o functie simpla care calculeaza media a 3 numere
    // ne da un raspuns = suma! va avea return
    //ce tip de date va avea raspunsul? 3+6=9 int! /2=4.5 double!
    // are nevoie de parametri
    public static double mediaNr(double a, double b, double c){
        double media=(a+b+c)/3;
        return media;
    }

    // o functie simpla care ne da valoarea lui pi
    // ne da un raspuns? Da
    //ce tip de date va avea raspunsul? double 3.14
    // are nevoie de parametri? Nu
    public static double piValue(){
        //constanta - variabila care nu poate fi suprascrisa
        final double PI = 3.14;
        return PI;
    }
// ----------ZONA DE APELARE------(desktop)
    public static void main(String[] args) {
        //intra clientul 1
        printGreeting(); // se apeleaza functia () tre sa aiba paranteze
        // intra clientul 2
        printGreeting();

        //String hello=printGreeting(); nu merge ca e un void. ar trebui functia scrisa -public static String...
        //Apelam o functie cu parametrii, oferim argumente
        printGreetingByName("Popa","Rares");
        printGreetingByName("Popa","Ioan");

        System.out.println(mediaNr(3,3,4));

        double media1 =mediaNr(2342423, 3 , 3);
        double media2 =mediaNr(234242 , 3 , 3);
        double media3 =mediaNr(23424 , 4 , 3);
        System.out.println(media1);
        System.out.println(media2);
        System.out.println(media3);

        System.out.println(piValue());

        //tema aria unui dreptunghi
        //aria cerc
        //suma a 2 nr
        //functie care returneaza cate caractere are numele + prenumele tau
        String nume="Rares";
        System.out.println(nume.length());
    }
}
