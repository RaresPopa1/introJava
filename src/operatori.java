import java.sql.SQLOutput;

// char string int double boolean variabile
/* Operatori: aritmetici: +, -, *, /, % (aflarea restului impartirii)
de comparare: < > == != <= >=
logici: && || (si sau) ! (not)

Flow control - if else
evalueaza conditii si bifurca codul in functie de rezultat
*/
public class operatori {
    public static void main(String[] args) {
        int a = 3; //o declarare && initializare
        int b = 5;
        a = b; //suprascriere

        System.out.println(a!=b); //5 diferit de 5? => false
        System.out.println(a==b); //5 = 5? => true
        System.out.println(7>b && 8>b); //7>5 SI 8>5 doar daca amandoua sunt mai mari primim true
        System.out.println(7>b || 3>b); // 3!>b fals dar pt ca una din ele e adevarata o sa primim true
        System.out.println(7>b && (8>b || 3>b)); // se evalueaza paranteza prima si va da true
        System.out.println(!(7>b)); //7>b? !true=false

    }
}
