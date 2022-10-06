import java.util.Scanner;
public class Ejercicio2 { 
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    System.out.print("Introduzca su nombre u apodo:  ");
    String name =sc.next();
    System.out.print("Introduzca su dirección(sin espacios):   ");
    String direction = sc.next();
    System.out.print("Introduzca su número de teléfono:   ");
    String telphone = sc.next();
    System.out.println("Bienvenido Sr/a    "+name);
    System.out.println("Con teléfono:   "+telphone);
    System.out.println("Con dirección:   "+direction);
    
}}