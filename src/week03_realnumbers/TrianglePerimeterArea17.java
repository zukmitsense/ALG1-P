package week03_realnumbers;

import java.util.Scanner;

/**
 *
 * Test case
 * in: 1 2 5 2 5 5
 * expected output: 12, 6
 */
public class TrianglePerimeterArea17 {
    public static void main(String[] args) {
        //in
        Scanner sc = new Scanner(System.in);
        double ax, ay, bx, by, cx, cy;
        System.out.println("Zadej souradnice vrcholu trojuhelnika");
        ax = sc.nextDouble();
        ay = sc.nextDouble();
        bx = sc.nextDouble();
        by = sc.nextDouble();
        cx = sc.nextDouble();
        cy = sc.nextDouble();
        
//        ax = 1;
//        ay = 2;
//        bx = 5;
//        by = 2;
//        cx = 5;
//        cy = 5;
        
        //calc
        double c = Math.sqrt (Math.pow(ax - bx,2) + Math.pow(ay - by,2));
        double a = Math.sqrt (Math.pow(bx - cx,2) + Math.pow(by - cy,2));
        double b = Math.sqrt (Math.pow(cx - ax,2) + Math.pow(cy - ay,2));
       
        double obvod = c + a + b;
        double s = obvod/2 ;
        double obsah = Math.sqrt(s *(s - a)*(s - b)*(s -c));
        
        //out
        System.out.printf("Obvod se rovna: %.2f\n", obvod);
        System.out.printf("Obsah se rovna: %.2f\n", obsah);
    }       
 }
