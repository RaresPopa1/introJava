import java.util.HashMap;
import java.util.Map;
//cheie : valoare
public class Maps {
    public static void main(String[] args) {
        // map = reprezentare de date in sistem cheie valoare
        //ex: Gigel are nota 10, Costel are nota 9

        // declaram un map
        Map<String,Integer> noteElevi =new HashMap<>();

        //adaugam elemente
        noteElevi.put("Gigel", 10);
        noteElevi.put("Costel", 9);
        noteElevi.put("Ana", 10);

        //aflu notele
        System.out.println("Ana are nota: " + noteElevi.get("Ana"));

        // Suprascriere / Actualizam valori
        noteElevi.replace("Costel", 10);
        System.out.println("Costel si-a marit nota la: " + noteElevi.get("Costel"));

        // Aflam dimensiunea
        System.out.println(noteElevi.size());

        // Stergem valori
        noteElevi.remove("Gigel");
        System.out.println(noteElevi.size());
    }
}
