import java.util.Scanner;
//Ejercicio 7 de condicionales
//Introducir un número y que el programa indique el número de cifras que tiene

public class Condicionales7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número");
        int numero = sc.nextInt();

        if (numero < 10){
            System.out.println("Su número tiene 1 cifra");
        }
        if (numero < 100 && numero >= 10){
            System.out.println("Su número tiene 2 cifras");
        }
        if (numero < 1000 && numero >= 100){
            System.out.println("Su número tiene 3 cifras");
        }
        if (numero < 10000 && numero >= 1000){
            System.out.println("Su número tiene 4 cifras");
        }
        if (numero < 100000 && numero >= 10000){
            System.out.println("Su número tiene 5 cifras");
        }
        if (numero < 1000000 && numero >= 100000){
            System.out.println("Su número tiene 6 cifras");
        }
        if (numero > 1000000){
            System.out.println("ERROR: el número es demasiado grande, por favor introduzca un número más pequeño");
        }
    }
}
