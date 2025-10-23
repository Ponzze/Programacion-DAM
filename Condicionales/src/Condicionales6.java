import java.util.Scanner;

//Ejercicio 6 de condicionales
//Introducir un número y que el teclado diga si es par o impar, divisible entre 5 o no
public class Condicionales6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un número");
        int numero = sc.nextInt();

        if (numero % 2 == 0 ) {
            System.out.println("Su número es par");
        }else System.out.println("Su número es impar");

        if (numero % 5 == 0 ) {
            System.out.println("Su número es divisor de 5");
        }else System.out.println("Su número no es divisor de 5");
    }
}
