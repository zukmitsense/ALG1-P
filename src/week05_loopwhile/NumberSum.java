package week05_loopwhile;

import java.util.Scanner;

public class NumberSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //in
        int value;
        //out
        int sum = 0;
        int count = 0;
        double average = 0;
        
        
        
        
        System.out.println("Zadejte kladna cisla, ukoncete nulou nebo zapornim cislem:");
        //value = sc.nextInt();
        while ((value = sc.nextInt()) > 0) {
            sum = sum + value;
            count++; //count = count + 1
            //value = sc.nextInt();
        } 
        
        if (count != 0) {
            average = (double) sum / count;
        }
        
        System.out.printf("Průměr: %.2f\n"
                + "Počet zadaných hodnot: %d\n"
                + "Součet: %d\n", average, count, sum);

    }

}
