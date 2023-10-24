import java.util.Scanner;

public class EjercicioArray01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuantas palabras vas a almacenar?: ");
        int numPalabras = scanner.nextInt();

        String [] palabras = new String [numPalabras];
        for (int i = 0; i <palabras.length ; i++) {
            System.out.println("Introduce las palabras: ");
            String palabrasTeclado = scanner.next();
            palabras[i] = palabrasTeclado;

        }

        for (int i = 0; i < palabras.length; i++) {
            System.out.println(palabras[i]);
        }






    }
}
