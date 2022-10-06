import java.util.Scanner;

/**
* Muestra por pantalla la frase "¡Hola mundo!"
*
*/
public class Ejercicio2 { // Clase principal
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    System.out.print("Introduzca su nombre u apodo:  ");
    String name =sc.next();
    System.out.print("Introduzca su dirección:   ");
    String direction = sc.next();
    System.out.print("Introduzca su número de teléfono:   ");
    String telphone = sc.next();
    System.out.println("Bienvenido Sr/a    "+name);
    System.out.println("Con teléfono:   "+telphone);
    System.out.println("Con dirección:   "+direction);
    
}}