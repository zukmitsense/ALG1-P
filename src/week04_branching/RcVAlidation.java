package week04_branching;

import java.util.Scanner;

public class RcVAlidation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadejte prni 6 cisel");
        long cast1 = sc.nextLong();
        System.out.println("Zadejte ostatni 4 cisla");
        long cast2 = sc.nextLong();

        long rc = (cast1 * 10000 + cast2);
        long poslc = rc % 10;
        long rc9 = rc / 10;
        long zbytek = rc9 % 11;

        boolean valid = false;
        if ((zbytek == 10) && (poslc == 0)) {
            valid = true;
        } else if (zbytek == poslc) {
            valid = true;
        }
        System.out.println("Rodne cislo " + ((valid) ? "je" : "neni") + "spravne.");
    }
}
