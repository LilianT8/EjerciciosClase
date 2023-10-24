import java.util.Scanner;

public class Funcion01 {

        public static void main (String[]args){

           int size = pedirTamano();
           int opcion = Menu();



            switch (opcion) {
                case 1:
                    downUpLeft(size);
                    break;
                case 2:
                    downUpRight(size);
                    break;
                case 3:
                    upDownLeft(size);
                    break;
                case 4:
                    upDownRight(size);
                    break;
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }

        public static int Menu(){
            Scanner scanner = new Scanner(System.in);

            System.out.println("Selecciona la orientación de la pirámide:");
            System.out.println("1. Arriba");
            System.out.println("2. Abajo");
            System.out.println("3. Izquierda");
            System.out.println("4. Derecha");
            int num = scanner.nextInt();
            return num;
    }

        public static void upDownLeft(int n){
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public static void downUpLeft(int n){
            for (int i = n; i >= 1; i--) {
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public static void upDownRight(int n){
            for (int i = 1; i <= n; i++) {
                for (int j = n; j > i; j--) {
                    System.out.print(" ");
                }
                for (int k = 1; k <= i; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public static void downUpRight(int n){
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j < i; j++) {
                    System.out.print(" ");
                }
                for (int k = i; k <= n; k++) {
                    System.out.print("*");
                }
                System.out.println();


            }


        }

        public static int pedirTamano(){

            Scanner scanner = new Scanner(System.in);
            int n;

           do{ // lo que esta dentro del while no lo ve
               System.out.println("Introduce el número de filas para la pirámide:");
               n = scanner.nextInt();


           }while (n > 99 || n < 1);


            return n;
        }


    }
