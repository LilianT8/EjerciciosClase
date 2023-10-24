import java.util.Scanner;

public class Funcion03Menu {

    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);
        int n, num = 0, num3 = 0, num4=0;
        double num1 = 0, num2 = 0;

       do {
           Menu();
           System.out.println();
           System.out.print("Elige una opcion:");
           n = scanner.nextInt();

           if (n == 1){
               System.out.print("Escribe el primer numero: ");
               num1 = scanner.nextDouble();

               System.out.print("Escribe el primer numero: ");
               num2 = scanner.nextDouble();
           }else if (n == 3 || n == 4 || n == 5){
               num= pedirNumero();
           } else if (n == 2) {
               System.out.print("Escribe el primer numero: ");
               num3 = scanner.nextInt();

               System.out.print("Escribe el primer numero: ");
               num4 = scanner.nextInt();
           }
       }while (n < 1 || n > 5);


        switch (n) {
            case 1:
                System.out.println(Minimo(num1, num2));
                break;
            case 2:
                System.out.println(GCD(num3, num4));
                break;
            case 3:
                TablaMultiplicar(num);
                break;
            case 4:

                Primos(num);
                break;

            case 5:
                Factorial(num);

                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }


    public static void Menu(){
        System.out.println("* 1. Calcula el minimo entre dos numeros                                        *");
        System.out.println("* 2. Calcula el GCD de dos números(los dos números tienen que ser >0            *");
        System.out.println("* 3. Calcula la tabla de multiplicar de un número                               *");
        System.out.println("* 4. Calcula todos los números primos hasta el número dado                      *");
        System.out.println("* 5. Calcular el factorial de 0 hasta el número dado                            *");
        System.out.print("*********************************************************************************");
    }

    public static double Minimo(double numero1, double numero2) {
        if (numero1 < numero2)
            return numero1;

        return numero2;
    }

    public static int GCD(int a, int b){
            if (a == 0)
                return b;

            while (b != 0) {
                if (a > b)
                    a = a - b;
                else
                    b = b - a;
            }
            return a;
    }

    public static void TablaMultiplicar(int numero5) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " x " + numero5 + " = " + i*numero5);
        }
    }

    public static void Primos(int num){
        for(int i=2;i<=num;i++){
            boolean primo = true;
            int j = i-1;

            while(j>=2 && primo){
                if(i%j==0){
                    primo = false;
                }
                j--;
            }

            if(primo){
                System.out.print(" " + i);
            }

        }
        System.out.println("");
    }

    public static void Factorial(int num) {
        for (int i = 0; i <= num; i++) {
            //calcula el factorial
            long factorial = 1;
            for (int j = i; j >= 1; j--) {
                factorial = factorial * j;
            }
            System.out.println("Factorial of " + i + "! : " + factorial);
        }

    }

    public static int pedirNumero(){
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Escribe el numero : ");
        num = scanner.nextInt();
        return num;
    }




}





