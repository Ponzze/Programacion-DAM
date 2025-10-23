import java.util.Scanner;

public class Ejercicio1 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int numero = sc.nextInt();
        if (numero % 2 == 0){
            System.out.println("Su número es par");
        }else System.out.println("Su número es impar");
    }
}
