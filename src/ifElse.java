/* Flow control - if else
evalueaza conditii si bifurca codul in functie de rezultat
 */

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        System.out.println("pornim radio");
        //daca imi place piesa, dau mai tare
        boolean piesa_faina = true; //invat calculatorul daca e faina sau nu
        if (piesa_faina == true) {
            System.out.println("dau mai tare");
            System.out.println("incep sa o fredonez");
        } else if (piesa_faina == false) {
            System.out.println("BAG PULA N RADIO");
        }

        System.out.println("oprim radio");

        //if else
        int nr = 2;
        if (nr % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }

        //if, else if, else
        //luam date de la tastatura
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti ora ");
        int ora = sc.nextInt(); //next int ptc ca e intreg daca aveam string era nextString
        if (ora < 0) {
            System.out.println("ora negativa");
        } else if (ora <= 11) {
            System.out.println("neata");
        } else if (ora <= 18){
            System.out.println("nziua!");
        } else if (ora <= 21) {
            System.out.println("naseara");
        } else if (ora <= 24) {
            System.out.println("noapte buna");
        } else System.out.println("ora prea mare");

        //SWITCH - se foloseste cand stim valorile posibile
        System.out.println("Alege optiunea");
        int optiune = sc.nextInt();
        switch (optiune){
            case 0:
                System.out.println("Meniu anterior");
                break;
            case 1:
                System.out.println("Ati ales romana");
                break;
            case 2:
                System.out.println("Ati ales engleza");
                break;
            default:
                System.out.println("Optiune invalida");
        }
    }
}