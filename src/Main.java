import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor ingrese la cantidad deseada de números");
        int cant = sc.nextInt();
        System.out.println();

        int[] num = new int [cant];
                for(int i =0; i< cant; i ++) {
                    System.out.println("Número " + (i + 1) + ":");
                    num[i] = sc.nextInt();
                }//Cierra For
        Arrays.sort (num);

         System.out.println("Numeros Ordenados: ");
         for(int i=0; i<num.length; i++) {
             System.out.print(num[i] + " ");
         }//Cierra For
         System.out.println();
    }//Cierra Main
}//Cierra Class