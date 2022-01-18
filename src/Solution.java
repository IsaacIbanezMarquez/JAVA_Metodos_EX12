


public class Solution
{

    // 12) Programa que simula el lanzamiento de dos dados y muestra por pantalla la frecuencia de los
    //resultados de mil lanzamientos

    public class Dosdados {
        public static void main (String [] args) {
            int dado1, dado2, resultado;
            int [] frecuencia = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0} ;
            for (int i=1; i<=1000; i++) {
                dado1 = (int) (6*Math.random() + 1); // Entre 1 y 6
                dado2 = (int) (6*Math.random() + 1); // Entre 1 y 6
                resultado = dado1+dado2;
                frecuencia[resultado-2]++;
            }
            System.out.println("Frecuencias de los resultados:");
            for (int i=0; i<=10 ; i++) {
                System.out.print("Frecuencia de " + (i+2));
                System.out.println(": " + frecuencia[i]);
            }
        }
    }

}
