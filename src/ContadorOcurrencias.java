import java.util.Scanner;

public class ContadorOcurrencias {

    // Método para contar ocurrencias de un número en un arreglo
    public static int contarOcurrencias(int buscado, int[] arreglo) {
        int contador = 0; //inicio el contador en 0
        for (int numero : arreglo) { //recorremos el arreglo
            if (numero == buscado) {
                contador++;
            }
        }
        return contador;
    }

    // Método para manejar la interacción con el usuario
    public static void instrucciones() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese la longitud del arreglo: ");
        int longitudArray = scanner.nextInt();
        int[] arreglo = new int[longitudArray];

        System.out.println("Ingrese los elementos del arreglo: ");
        for (int i = 0; i < longitudArray; i++) {
            arreglo[i] = scanner.nextInt();
        }

        System.out.println("Ingrese el número que desea buscar:");
        int buscado = scanner.nextInt();

        int resultado = contarOcurrencias(buscado, arreglo);
        System.out.println("El número " + buscado + " aparece " + resultado + " veces en el arreglo.");
    }

    public static void main(String[] args) {
        instrucciones();
    }
}