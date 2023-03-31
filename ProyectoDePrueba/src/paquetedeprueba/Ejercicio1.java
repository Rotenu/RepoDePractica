
package paquetedeprueba;

import java.util.Scanner;

/*Escribir un programa que pida dos numeros enteros por teclado y calculelasuma de los dos.
El programa debera despues mostrar el resultado de la suma */

public class Ejercicio1 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el valor de dos numeros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        int suma = num1 + num2;
        System.out.println("El resultado de la suma es : " + suma);
        //Definir numero como entero numero = 5;
        //int numero = 5;
        //TRES TERMINOS QUE UTILIZAMOS:
        //DECLARAR
        //INICIALIZAR
        //ASIGNAR  
        //double numeroDecimal = 5.22;
        //boolean booleano = true;
       //String nombre = "Rosana";
        // Ejemplo para imprimir en pantalla System.out.println("Hola Bienvenido al programa" + numero);
        //numero++ es incrementar, es igual que numero = numero + 1;
       
        
    }
}
