```java

package mx.edu.uttt.arreglos;

import javax.swing.*;
import java.util.Vector;

public class VectoresDobles {
    public static void main(String[] args) {
        int tamanio= 0;
        tamanio = obtenerTamanio();
        double arr [] = new double[tamanio];
        llenarArreglo(arr);
        imprimir(arr);
    }
    public static int obtenerTamanio() {

    return Integer.parseInt(
            JOptionPane.showInputDialog("Introduce el tamanño del arreglo"));
    }
    public static void llenarArreglo(double [] vector) {
        for (int i = 0; i < vector.length; i++) {
            
            vector[i] = Double.parseDouble(JOptionPane.showInputDialog("Introduce el valor del arreglo [ " + i +" ]"));
        }



    }


    public static void imprimir(double vector[]) {
        String salida="";
        for(double valor: vector) {
            salida+="|"+ valor+"| \n";
        }
        JOptionPane.showMessageDialog(null, salida);
    }
    }

````