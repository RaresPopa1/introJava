public class Array {
    public static void main(String[] args) {
        //ARRAY - un fel de clasa(cu elevi inauntru) ca o lista care contine toti elevii
        // ca un cos, ca sa nu scriem toate elementele din el
        //int array[10] = {10, 45, 75, ... }
        // 10 e dimensiunea

        //DECLARARE (cand stim care sunt valorile)
        String[] elevi={"Gigel","Costel", "Mari", "Ela", "Ada"};
        int[] numere={1, 33, 81, 99, 201};
        //contine mai multe elmente de acelasi tip
        //accesam elementele prin index, care incepe de la 0
        // are o dimensiune fixa!
        //are proprietatea length care ne da dimensiunea array-ului

        System.out.println(elevi[2]); //ultima Ada, nu 5!!
        elevi[2]="Sebi"; //Suprascriere
        System.out.println(elevi[2]); //Sebi
        System.out.println(elevi.length); //5

        //Putem sa ne jucam cu valorile din spate
        System.out.println(elevi[0]+" "+elevi[1]); // Gigel Costel
        System.out.println(elevi.length+5); //=10

        //sa printam mereu ultimul element indiferent de marime
        System.out.println("Last place: " + elevi[elevi.length - 1]); //-1 pt ca el numara de la 0 si da ca are 5 dar ultimul e 4

        //declarare si alocare de memorie
        int[] note = new int[5]; //0, 0, 0, 0, 0
        System.out.println(note[1]);
        note[0]=10;
        note[1]=9;
    }
}
