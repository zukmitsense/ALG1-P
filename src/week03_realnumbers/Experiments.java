
package week03_realnumbers;

public class Experiments {
    public static void main(String[] args) {
        int a = 9;
        int b = 2;
        
        System.out.println(a/b);
        System.out.println(a%b);
        
        double c = a/b;
        System.out.println(c); //4.0
        System.out.println((double)a/b); //9.0 / 2
        
        long d = 5; //implicitni konverze
        double aa = 4; //implicitni konverze
        int bb = (int)5.6; //expicitni konverze
        System.out.println(bb);
        
        double x = 5.6;
        double y = 5.8;
        System.out.println(x + y);
        
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE + 1);

        
    }
}
