package oop;

public class contBancar {
    //program files = definim logica unui cont bancar
    //OBJECT ORIENTED PROGRAMMING

    // o clasa = este un tip nou
    // este definitia unui concept
    // Reteta la paste carbonara
    //ex: clasa Car

    // un obiect = instanta unei clase
    // pastele carbonara
    //ex: obiect de tip Car

    //fields = proprietati = atribute
    //variabile
    //ex: culoare, marca, model, consum, pret

    //metode - actiuni ce pot fi facute de obiecte
    //functii
    //ex: accelereaza(), franeaza(), etc.

    //PROPRIETATILE, fields
    String titularCont;
    String iban;
    double sold = 0;
    boolean activ = false; //daca vrem sa ascundem 'private boolean'
    private int pin=7777;
    int incercariActivare=0;

    //CONSTRUCTOR - are rolul de a impune date de start
    //ca si stelutele din formulare, required fields
    //click dreapta generate, constructor, select tit si iban.
    public contBancar(String titularCont, String iban) {
        this.titularCont = titularCont;
        this.iban = iban;
    }

    //METODE de apelare
    public void descriere(){ //cd refactor rename - daca vrem sa schimbam descrierea
        System.out.println("Titular "+this.titularCont);
        System.out.println("IBAN "+this.iban);
        System.out.println("Sold "+this.sold);
        System.out.println("Activ: "+this.activ);
        System.out.println("Nr incercari gresite: "+incercariActivare);
        System.out.println("------------------------------------------");
    }
    public void activareCont(int pinUtilizator){
        //modifica activ in true, doar Daca pinul e corect
        System.out.println("Buna "+this.titularCont);
        if(pinUtilizator==this.pin){
            System.out.println("Activat cu succes!");
            this.activ=true;
        } else {
            System.out.println("PIN Gresit!");
            this.incercariActivare++;
        }
    }
    public void alimentareCont(double sumaDepusa){
        //la ce aveam in cont (this.sold) se mai adauga suma depusa
        this.sold = this.sold + sumaDepusa;
        System.out.println("Buna "+this.titularCont);
        System.out.println("Depunere cu succes suma "+sumaDepusa+ ". Aveti in cont suma de "+this.sold+".");
    }
    public void plataCard(double sumaCheltuita){
        System.out.println("Buna "+titularCont);
        //pot sa cheltuiesc doar ce am
        //daca suma cheltuita <= soldul
        if(sumaCheltuita<=this.sold){
            this.sold=this.sold-sumaCheltuita;
            System.out.println("Ai cheltuit "+sumaCheltuita);
            System.out.println("Mai ai "+this.sold);
        } else {
            System.out.println("Fonduri insuficiente!");
        }
    }

}
