import java.util.Scanner;

/**
 * Implement a program to
 *  1 - Calculate the minimum between two numbers
 *  2 - Calculate the GCD of two numbers (both must be > 0)
 *  3 - Calculate the multiplication table of a given number
 *  4 - Calculate all prime numbers until a given number (must be > 0)
 *  5 - Calculate the factorial numbers from 0 until a given number (must be >=0)
 *  0 - Leave the program
 */
public class Funcion06Menu2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option=0, num1=0, num2=0;

        do{
            menu();
            System.out.print("Option?: ");
            option = scanner.nextInt();
            //si entre 1 y 5 pedir num1
            if(option>=1 && option<=5){
                System.out.print("Introduce number #1: ");
                num1 = scanner.nextInt();
                //si 1 o 2 pedir num2
                if(option==1 || option ==2){
                    System.out.print("Introduce number #2: ");
                    num2 = scanner.nextInt();
                }

                if(option==1){
                    int minimoNum = minimo(num1,num2);
                    System.out.println("El mínimo es: " + minimoNum);
                } else if (option==2) {
                    if(num1>0 && num2 > 0){
                        int maximoComunDiv = mcd(num1, num2);
                        System.out.println("El MCD es: " + maximoComunDiv);
                    } else{
                        System.out.println("Algún número no cumple requisitos");
                    }
                } else if(option==3) {
                    multiplicar(num1);
                } else if(option==4){
                    primos(num1);
                } else if (option==5) {
                    calcFactorial(num1);
                }
            }
        }while(option!=0);

    }

    public static void menu(){
        System.out.println("**********************************************************************************");
        System.out.println("* Choose an option or 0 to quit                                                  *");
        System.out.println("* 1 - Calculate the minimum between two numbers                                  *");
        System.out.println("* 2 - Calculate the GCD of two numbers (both must be > 0)                        *");
        System.out.println("* 3 - Calculate the multiplicate table of a given number                         *");
        System.out.println("* 4 - Calculate al prime numbers until a given number (must be > 0)              *");
        System.out.println("* 5 - Calculate the factorial numbers from 0 until a given number (must be >=0)  *");
        System.out.println("**********************************************************************************");
    }

    public static int minimo(int numero1, int numero2){
        if(numero1<numero2)
            return numero1;
        else
            return numero2;
    }

    public static int mcd(int numero1, int numero2){
        int minimoNum = minimo(numero1, numero2);
        int maximoCD=0;
        for (int i = 1; i <= minimoNum ; i++) {
            if(numero1%i==0 && numero2%i==0){
                maximoCD = i;
            }
        }
        return maximoCD;
    }

    public static void multiplicar(int num){
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }

    public static void primos(int num){
        if (num <= 0) {
            System.out.println("We need a positive number");
        } else if (num == 1) {
            System.out.println("Number " + num + " actually is not a prime number");
        } else {
            for (int i = 2; i <= num; i++) {
                boolean prime = true;
                int j = i - 1;
                while (prime && j >= 2) {
                    if (i % j == 0)
                        prime = false;
                    j--;
                }
                if (prime) {
                    System.out.println("Number " + i + " is prime");
                }
            }
        }
    }

    public static void calcFactorial(int a) {
        if (a < 0) {
            System.out.println("We need a positive number");
        } else {
            for (int i = 0; i <= a; i++) {
                long factorial = 1;
                for (int j = 1; j <= i; j++) {
                    factorial = factorial*j;
                }
                System.out.println(i + "! = " + factorial);
            }
        }
    }

}
