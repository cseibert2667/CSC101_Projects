import java.util.Scanner;
import java.util.Arrays;
public class test {
    public static void swapValues(int x, int y) {

        int tmp;
     
        tmp = x;
     
        x = y;
     
        y = tmp;
     
     }  
     
     public static void main(String args[]) {
     
        int p = 4, q = 3;
     
        swapValues(p, q);
     
        System.out.print("p = " + p + ", q = " + q);
     
     }
}
