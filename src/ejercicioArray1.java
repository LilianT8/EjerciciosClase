// mostra valor mas indice
public class ejercicioArray1 {
    public static void main(String[] args) {
        int suma = 0, media = 0;
        double mayor = 0, menor = 0;
        double[] notas = new double[21];

        for (int i = 0; i < notas.length; i++) {
            notas[i] = Math.random() * 10;
            System.out.println("ÍNDICE " + i + "  VALOR : " + String.format("%,.2f", notas[i]));
            suma += notas[i];


            if (i == 0) {
                mayor = notas[i];
                menor = notas[i];
            } else if (notas[i]> mayor) {
                mayor= notas[i];

            } else if (notas[i]< menor) {
                menor = notas[i];

            }


        }

        media = suma / notas.length;
        System.out.println("La media es: " + media);
        System.out.println("El mayor es: " + mayor + " el menor es: " + menor);
    }
}
