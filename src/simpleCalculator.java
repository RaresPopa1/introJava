// Implementeaza o aplicatie "Simple Calculator"

//NOU foarte important import java.util.Scanner; *
import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) { //psvm

        // initializam Scanner
        Scanner scan = new Scanner(System.in); //*

        // initializam rezultatul operatiei ADICA IL DEFINIM
        int rezultat = 0;

        // citim a
        System.out.println("Alege valoarea lui a");
        int a = scan.nextInt(); //*

        // alege operatia
        System.out.println("Alege operaia dintre + - * /");
        String op = scan.next(); //* il definim si pe OP dar pt ca nu e numar il punem cu String, daca era cu zecimale puneam double ca ex;

        // exercitiu: citim b
        System.out.println("Alege valoarea lui b");
        int b = scan.nextInt();

        if (op.equals("+")) {  //*
            rezultat = a + b;
        } else if (op.equals("-")) {
            rezultat = a - b;
        } else if (op.equals("/")) {
            rezultat = a / b;
        } else if (op.equals("*")) {
            rezultat = a * b;
        } else {
            System.out.println("Operatie Invalida"); // Daca OP este altceva decat +-*/ atunci sa zica ca e invalid
        }
        System.out.print("Rezultatul este " + rezultat);
    }
}





