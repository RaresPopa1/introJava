import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Liste {
    public static void main(String[] args) {
        // declaram o lista goala FORMULA DE JOS SE COPIAZA CAND AI NEV DE EA
        List<String> fructe = new ArrayList<>(); //click pe rosu - option + enter ca sa puna sus librariile
        // listele au dimensiuni dinamice
        // adaugam elemente in lista
        fructe.add("mar");
        fructe.add("bnn");
        fructe.add("prtcl");

        //cum se iau elementele
        System.out.println(fructe.get(0)); //mar!
        System.out.println(fructe.indexOf("bnn"));

        //este lista goala?
        System.out.println(fructe.isEmpty());

        //Aflam dimensiunea listei
        System.out.println(fructe.size());

        //eliminam toate elementele din lista
//        fructe.clear(); // NU AVEM CE MANCA

        //scoatem un element
        fructe.remove("mar");
        //Listam elementele
        System.out.println(fructe);

        if(!fructe.isEmpty()){ //daca nu este goala
            System.out.println("avem ce manca");
        } else {
            System.out.println("nu avem ce manca");
        }

        //declaram o lista imutabila si o initializam cu valori
        List<String> list = Arrays.asList(new String[]{"foo", "bar"});
        List<Integer> list1 = Arrays.asList(new Integer[]{1, 33, 77});
        System.out.println(list);
        System.out.println(list1);

        //Declaram o lista dinamica
        String[] list3 = {"C++", "Java", "Pascal", "C"}; //pornim de la un array
        List<String> programareList = new ArrayList<>(Arrays.asList(list3)); // il facem lista
        programareList.add("C#");
        System.out.println(programareList);

        //aflam unde este Pascal si il scoatem
        int pascal_index = programareList.indexOf("Pascal"); //Il salvam intr o variabila
        programareList.remove(pascal_index); //Stergem ce e pe pozitia aia.
        System.out.println(programareList); //doar daca e declarat ca lista
        System.out.println(list3); // aici e un array simplu si nu merge
    }
}
