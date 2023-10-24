import java.util.Scanner;

public class Funcion09 {

    public static void main(String[] args) {

MayorMenorEdad();


    }

        public static boolean MayorMenorEdad (){
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce una edad");
            int edad = sc.nextInt();
            boolean mm;
            if (edad>=18)
              return true;
            else
                return false;
        }


        }





