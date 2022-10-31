/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package week05_Loops;

import java.util.Scanner;

/**
 *
 * @author jana.vitvarova
 */
public class NumberSum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
        
        System.out.printf("Průměr: %.2f\nPočet zadaných hodnot: %d\nSoučet: %d\n", average, count, sum);

    }

}
