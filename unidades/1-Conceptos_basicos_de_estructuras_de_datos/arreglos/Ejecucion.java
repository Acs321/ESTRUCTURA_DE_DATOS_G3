package mx.edu.uttt.arreglos;

import java.util.Scanner;

public class Ejecucion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos el tamaño del arreglo
        System.out.println("Ingrese el tamaño del arreglo:");
        int tamanio = scanner.nextInt();

        // Creamos un arreglo de ese tamaño
        double[] valores = new double[tamanio];

        // Pedimos los valores al usuario
        System.out.println("Ingrese " + tamanio + " valores para el empleado:");
        for (int i = 0; i < tamanio; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            valores[i] = scanner.nextDouble();
        }

        // Creamos el objeto usando esos valores
        OperacionesArreglos operaciones = new OperacionesArreglos(valores);

        // Usamos los métodos de la clase
        operaciones.imprimirArreglos();
        System.out.println("Suma de valores: " + operaciones.sumarValores());
        System.out.println("Valor máximo: " + operaciones.obtenerValorMaximo());
        System.out.println("Valor mínimo: " + operaciones.obtenerValorMinimo());

        scanner.close();
    }
}
