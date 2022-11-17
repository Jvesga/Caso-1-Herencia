package Ejecutable;

import javax.swing.JOptionPane;

import Modelo.suma;

public class main 
{
    public static void main(String[] args) 
    {
     //Entrada de datos 
     double x = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de x: "));
     double y = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor de y: "));
     
     //Creacion de un objeto suma
     suma miSuma = new suma(x, y);
     miSuma.sumar();
     JOptionPane.showMessageDialog(null, "La suma de" + x + "y" + y + "es" + miSuma.mostrarResultados());

     System.exit(0);
    }   
}
