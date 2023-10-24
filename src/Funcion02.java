import java.util.Scanner;

public class Funcion02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Introduce un numero: ");
        int numero1 = scanner.nextInt();
        double funcion1= mayor(numero1, 4);
        System.out.println( funcion1);
    }


    public static double mayor(double numero1, double numero2) {
        if (numero1 > numero2)
            return numero1;

     return numero2;
    }






}








