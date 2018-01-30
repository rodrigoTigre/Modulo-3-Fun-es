package javaapplication1;
import java.util.Scanner;
public class JavaApplication1 {

    static void Raizesquadradas(int linf, int lsup) {
        for (int I = linf; I < lsup; I++) {
            System.out.println(String.format("%5.1f", Math.sqrt(I)));
        }
    }

    public static void main(String[] args) {

        {
            Raizesquadradas(25, 36);
            Raizesquadradas(100, 120);
        }

    }

}
