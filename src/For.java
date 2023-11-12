public class For {
    public static void main(String[] args) {
        //for - LOOP, struct repetitiva
        //de unde incepem
        //pana unde mergem
        //pasul de percurgere

        //problema: printam 101 dalmatieni
        for(int i = 1; i<=101; i++) //ca sa nu printam cu sout de 101 ori
            //incepe de la 1, cat timp i<=101, sa adune i, adica i=i+1
            //practic i a fost declarat in FOR cu int deci mai jos cand il mentionam va stii ca e variabila
            System.out.println("Dalamtianul cu nr "+i);

        //ne ajuta sa parcurgem un ARRAY prin intermediul indexului
        int [] numere={3,7,3,7}; //numere[0]=3 !!!
        for(int i=0; i<numere.length; i++)
            System.out.println("Elementul are index " + i + " si valoareea "+numere[i]);

        //for each - parcurge toate elementele din array si ajunge direct!!! la valoare
        for (int numar:numere)
            System.out.println("Numarul este: "+numar);

        //Parcurgem ARRAY de culori
        String[] culori={"alb", "rosu", "galben"};
        for(String culoare:culori)
            System.out.println("Culoarea actuala este: "+ culoare);

        //Suma numerelor din ARRAY
        int s=0;
        for (int numar:numere) //s=3, nr 7
            s = s + numar;
        System.out.println(s);
    }
}
