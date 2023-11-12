public class Variabile {
    //psvm
    public static void main(String[] args) {
        // Declarare si initializare
        String marcaMasina = "Volvo";
        String modelMasina = "XC 60";
        // strongly typed - trebuie sa secificam tipul de date al variabilelor cu care lucram
        // nu putem sa punem numar daca e string.
        // trebuie ; la final
        // phyton nu e asa strict

        System.out.println("Am cumparat o masina marca: " + marcaMasina);
        System.out.println("Este modelul: " + modelMasina);

        // Suprascrierea
        modelMasina = "XC 60 facelift";
        System.out.println("Am cumparat o masina marca: " + marcaMasina);
        System.out.println("Este modelul: " + modelMasina);

        //declarare (SEPARAT ca idee)
        String nume;
        String prenume;
        //initializare
        prenume="Rares";
        nume="Popa";
        int varsta = 23;
        //concatenare 2 stringuri spatiu int
        System.out.println(nume+" "+prenume+" cu varsta de "+varsta);

    }
}
