package oop;

public class contBancarMain {
    public static void main(String[] args) {
        //desktop

        //initializam obiecte de tip contBancar
        //instante ale clasei contBancar
        contBancar cont1=new contBancar("Rares Popa", "RO001");
        contBancar cont2=new contBancar("Ioan Popa", "RO002");

        //apelam metoda descriere
//        cont1.descriere();
//        cont2.descriere();

        //activam conturile prin metoda activareCont
        cont1.activareCont(7777);
        //alimentam contul
        cont1.alimentareCont(700);
        cont1.descriere();
        cont2.activareCont(3333);
        cont2.activareCont(4444);
        cont2.activareCont(7777);
        //alimentam contul
        cont2.alimentareCont(300.50);
        cont2.alimentareCont(1000);
        cont2.descriere();

        //negative testing, ch mai mult decat avem
        cont1.plataCard(800); //corect fd ins

        //positive
        cont1.plataCard(700); //corect 0

        //positive 2x
        cont2.plataCard(100);
        cont2.plataCard(200);
    }
}
