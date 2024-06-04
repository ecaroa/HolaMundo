import java.util.Scanner;

public class ContadorElementos {


        public static int[] contarOcurrencias(int[] arreglo) {
            int[] contador = new int[10]; // arreglo para contar ocurrencias (índices 1 a 9)


            for (int numero : arreglo) { // Contar las ocurrencias de cada número en el arreglo
                if (numero >= 1 && numero <= 9) {
                    contador[numero]++;
                }
            }
            return contador;
        }

        // Método para imprimir el resultado en el formato deseado
        public static void imprimirOcurrencias(int[] contador) {
            for (int i = 1; i <= 9; i++) {
                System.out.print(i + ": ");
                for (int j = 0; j < contador[i]; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        // Método para instrucciones con el usuario
        public static int[] obtenerArregloDelUsuario() {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese la longitud del arreglo: ");
            int longitudArray = scanner.nextInt();
            int[] arreglo = new int[longitudArray];

            System.out.println("Ingrese los elementos del arreglo (números entre 1 y 9):");
            for (int i = 0; i < longitudArray; i++) {
                arreglo[i] = scanner.nextInt();
            }

            return arreglo;
        }

        public static void main(String[] args) {
            int[] arreglo = obtenerArregloDelUsuario();
            int[] contador = contarOcurrencias(arreglo);
            imprimirOcurrencias(contador);
        }
}