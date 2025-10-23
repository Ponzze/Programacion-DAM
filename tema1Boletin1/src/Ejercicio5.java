import java.util.Scanner;

public class Ejercicio5 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el primer número");
        int numero1 = sc.nextInt();
        System.out.println("Introduzca el segundo número");
        int numero2 = sc.nextInt();
        System.out.println("Introduzca el tercer número");
        int numero3 = sc.nextInt();
        System.out.println("Introduzca el cuarto número");
        int numero4 = sc.nextInt();

        int media = (numero1 + numero2 + numero3 + numero4) / 4;
        System.out.println("El valor de la media es de: " + media);

        if (numero1>media) {
            System.out.println(numero1);
        }
        if (numero2>media) {
            System.out.println(numero2);
        }
        if (numero3>media){
            System.out.println(numero3);
        }
        if (numero4>media){
            System.out.println(numero4);
        }
    }
}