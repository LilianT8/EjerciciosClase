import java.util.Scanner;

public class EjercicioArray02 {
    public static void main(String[] args) {

        int suma = 0, sumaNegativos=0, sumaPositivos=0, media=0;
        double mayor = 0, menor = 0;
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[10];

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("INTRODUCE NÚMERO " + (i+1) + ": ");
            int num = scanner.nextInt();
            numeros[i] = num;
            suma += numeros[i];

        }

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        for (int i = 0; i < numeros.length; i++) {
            if (i == 0) {
                mayor = numeros[i];
                menor = n   umeros[i];
            } else if (numeros[i] > mayor) {
                mayor = numeros[i];

            } else if (numeros[i] < menor) {
                menor = numeros[i];

            }
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i]>0) {
            sumaPositivos += numeros[i];

            } else if (numeros[i]<0) {
            sumaNegativos += numeros[i];

            }
        }
        media = suma / numeros.length;


        System.out.println("La suma de los valores es: "+suma);
        System.out.println("MAXIMO: " + mayor);
        System.out.println("MÍNIMO: " + menor);
        System.out.println("Suma positivos: "+sumaPositivos);
        System.out.println("Suma negativos: "+sumaNegativos);
        System.out.println("La media es: " + media);
}
}