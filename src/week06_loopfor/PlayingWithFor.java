package week06_loopfor;

public class PlayingWithFor {

    public static void main(String[] args) {
        //line
        int n = 10;
        for (int j = 0; j < n; j++) {
            System.out.print("*");
        }
        System.out.println("");

        //rectangle
        System.out.println("");
        int m = 5;
        for (int i = 0; i < m; i++) { //jde po radcich
            for (int j = 0; j < n; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        //pravouhly trojuhelnik
        System.out.println("");
        m = 3;
        for (int i = 1; i <= m; i++) { //jde po radcich
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

}
