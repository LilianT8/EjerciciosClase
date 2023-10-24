import java.util.Arrays;

public class EjercicioArray03 {
    public static void main(String[] args) {
        int[] enteros = {2, 3, 4, 7, 11, 23, 66, 66};
        int[] enteros2 = Arrays.copyOf(enteros, enteros.length);// Array a copiar , longitud
        String cadenaAImprimir = Arrays.toString(enteros2);
        System.out.println(cadenaAImprimir);

        String[] palabras = {"santi1", "santi2", "santi3", "santi4", "santi5", "santi6", "santi7", "santi8", "santi9", "santi10"};
        String[] palabras2 = Arrays.copyOf(palabras, palabras.length / 2);
        String cadenaAImprimir2 = Arrays.toString(palabras2);
        System.out.println(cadenaAImprimir2);
        //Copiar la mitad
        String[] palabras3 = Arrays.copyOfRange(palabras, palabras.length / 2, palabras.length);
        String cadenaAImprimir3 = Arrays.toString(palabras3);
        System.out.println(cadenaAImprimir3);
        //
        String[] palabras44 = copiaRango(palabras, 5, 10);
        System.out.println(Arrays.toString(palabras44));


    }

    //recorrer vector y devolver vector nuevo copiado sin usar copyrange. Tamaño es el to menos el from
    public static String[] copiaRango(String[] original, int from, int to) {
        String[] palabras4 = new String[to - from];
        int contador = 0;
        for (int i = from; i < to; i++) {
            palabras4[contador] = original[i];
            contador++;
        }
        return palabras4;
    }

    //Funcion para comparar dos arrays sin usar equals

    public static boolean funcionEquals(String[] array1, String[] array2) {
        //longitud no es igual
        if (array1.length != array2.length) {
            return false;
            //longitud es igual
        } else {
            for (int i = 0; i < array1.length; i++) {
                if (!array1[i].equals(array2[i])) {     //String es una clase no se compara igual que un int usando != se usa equals
                    return false;
                }
            }
        }
        return true;
    }

    public static String imprimir(String [] array){
        String cadena= "";
        for (String nuevoArray : array) {
            System.out.println(nuevoArray);
           cadena += nuevoArray + " ";
        }
        return cadena;

    }



}
