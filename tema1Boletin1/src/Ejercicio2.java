import java.util.Scanner;

public class Ejercicio2 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el primer número");
        int numero1 = sc.nextInt();
        System.out.println("Introduzca el segundo número");
        int numero2 = sc.nextInt();

        //Para que sea dependiente una condición de otra, utilizamos el else if
        if (numero1==numero2){
            System.out.println("Los números son iguales");
        }else if (numero1<numero2){
            System.out.println("El número 2 es mayor que el número 1");
        }else if (numero1 > numero2){
            System.out.println("El número 1 es mayor que el número 2");
        }
        }


    }

