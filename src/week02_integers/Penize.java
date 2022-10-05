package week02_integers;

public class Penize {
    public static void main(String[] args) {
        /*Zapište program, který pro zadanou celočíselnou hodnotu představující částku v korunách určí výčetku platidel,
tedy počet bankovek a mincí, kterými lze zadanou sumu zaplatit. Ve svém programu se omezte na bankovky
a mince v hodnotě 100, 50, 20, 10, 5, 2 a 1 Kč.*/
//TODO Scanner

//in
        int castka = 367;
        final int STO = 100; //konstanta
        final int PADESAT = 50;
        final int DVACET = 20;
        final int DESET = 10;
        final int PET = 5;
        final int DVA = 2;
        final int JEDNA = 1;
        
//processing
        int pocetSto = castka / STO;
        int zbytek = castka % STO;
        int pocetPadesat = zbytek / PADESAT;
        zbytek = zbytek % PADESAT;
        int pocetDvacet = zbytek / DVACET;
        zbytek = zbytek % DVACET;
        int pocetDeset = zbytek / DESET;
        zbytek = zbytek % DESET;
        int pocetPet = zbytek / PET;
        zbytek = zbytek % PET;
        int pocetDva = zbytek / DVA;
        zbytek = zbytek % DVA;
        int pocetJedna = zbytek / JEDNA;
                
//out
        System.out.println("Pocet sto: " + pocetSto);
        System.out.println("Pocet padesat: " + pocetPadesat);
        System.out.println("Pocet dvacet: " + pocetDvacet);
        System.out.println("Pocet deset: " + pocetDeset);
        System.out.println("Pocet pet: " + pocetPet);
        System.out.println("Pocet dva: " + pocetDva);
        System.out.println("Pocet jedna: " + pocetJedna);
    }
//TODO format
}
