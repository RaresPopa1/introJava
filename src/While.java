public class While {
    public static void main(String[] args) {
        // zona de cod care se repeta atat timp cat o conditie e TRUE
        // while este un LOOP, ciclu repetitiv

        //Problema: Masina merge cat timp cat are inca benzina
        int litri_benzina = 10;
        while(litri_benzina>0){
            //acceleram
            System.out.println("Vrum Vrum!");
            //scadem benzina
            litri_benzina = litri_benzina-1;
            //aprindem beculetul cand avem <=3L
            if(litri_benzina<=3){
                System.out.println("Se aprinde Becul Galben!");
            }
        }
        System.out.println("STOP, 0 gas");
    }
}
