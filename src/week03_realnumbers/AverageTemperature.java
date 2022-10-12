package week03_realnumbers;

import java.util.Scanner;

public class AverageTemperature {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej teploty v 6, 12 a 18 hodin");
        int tep6 = sc.nextInt();
        int tep12 = sc.nextInt();
        int tep18 = sc.nextInt();
        
//        int tep6 = 10;
//        int tep12 = 33;
//        int tep18 = 32;
        double prumTep;
        
        prumTep = (double)(tep6 + tep12 + tep18*2)/4;
        
        System.out.printf("Prumerna teplota je: %.2f.\n", prumTep);
    }
    
}
