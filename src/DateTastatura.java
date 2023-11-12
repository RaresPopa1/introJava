/*
    Cum luam date de la utilizator?
*/

import java.util.Scanner; // importam scanner

public class DateTastatura {
    public static void main(String[] args) {

        // initializam scanner
        Scanner scan = new Scanner(System.in);

        // printam un mesaj pt. utilizator
        System.out.print("Care e numarul tau preferat? ");
        int nr = scan.nextInt();

        // printam numarul preferat
        System.out.print("Numarul tau preferat este " + nr);
    }
}


