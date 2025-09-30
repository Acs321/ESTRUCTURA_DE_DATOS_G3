package mx.edu.uttt.arreglos;

import javax.swing.*;
import java.util.Arrays;

public class OperacionesArreglos {
    private double[] vector;
    private final int TAMANIO = 5;

    public OperacionesArreglos() {
        this.vector = new double[TAMANIO];
    }

    public OperacionesArreglos(int tamanio) {
        this.vector = new double[tamanio];
    }

    public OperacionesArreglos(double[] vector) {
        this.vector = new double[vector.length];
        llenarArreglos(vector);
    }

    /*public void llenarArreglos(double[] vector) {
        for (int i = 0; i < vector.length; i++) {
            this.vector[i] = vector[i];
        }
    }*/


    public void llenarArreglos(double[] vector) {
       int i = 0;
       do {
           i++;
           this.vector[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el valor del arreglo: "));
       }while (i < vector.length);

    }


    public double sumarValores() {
        double suma = 0;
        for (int i = 0; i <vector.length ; i++) {
            suma += vector[i];
        }
        return suma;
    }


    public double obtenerValorMaximo() {
        double minimo = this.vector[0];
        for (double valor : this.vector) {
            if (valor > minimo) {
                minimo = valor;

            }


        }

        return minimo;

    }





      /*  double maximo = 0;
        int i = 0;
        while (i < this.vector.length) {
            if (this.vector[i] > maximo) {
                maximo = this.vector[i];
            }


            i++;
        }
return maximo;

    }*/





    public double obtenerValorMinimo() {
        double minimo = 0;
        int i = 0;

        do {
            minimo = this.vector[i];
            i++;
        }while (i>this.vector.length);
        return minimo;
    }



    public void  cambiarTamanio(int tamanio){
        double temo []= new double[tamanio];
        for(int i=0;i<this.vector.length;i++){
            temo[i]=this.vector[i];
        }
        this.vector = temo;
        temo=null;
    }









    public void ordenarValores() {
        Arrays.sort(vector);
    }

    public String buscarValor(double valor) {
    String salida="";
    boolean sentinel=false;

        for(int i=0;i<vector.length;i++){
        if(valor== this.vector[i]){
            sentinel=true;
            salida+="El valor del arreglo es: "+valor+" Esta en la posiscion "+ i ;
break;
        }
    }
        if (!sentinel) {
            salida+="El valor no se encontro";
        }
        return salida;
    }

    public void imprimirArreglos() {
        System.out.println("Valores del arreglo:");
        for (double v : vector) {
            System.out.println(v);
        }
    }
}
