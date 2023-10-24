import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String frase = sc.nextLine(); // si pregunto por frase nextline() si palabra solo next()




    }
}

//El fragmento de código que proporcionaste recorre cada carácter en la cadena frase y,
//    si el carácter actual no es un espacio en blanco, agrega ese carácter a
//        la cadena aux.
//        En otras palabras, está construyendo una nueva cadena
//        aux que contiene todos los caracteres de frase excepto los espacios en blanco.
//        Este bucle for se utiliza para eliminar todos los espacios en blanco
//        de la cadena frase. La variable aux se utiliza como un acumulador
//        para construir la nueva cadena sin espacios. Cuando se completa
//        la iteración de este bucle, aux contendrá la misma cadena que frase,
//        pero sin espacios en blanco.
