import java.util.Scanner;

public class Ejercicio3 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un número");
        int numero =sc.nextInt();

        if (numero % 2 == 0 && numero % 3 == 0) {
            System.out.println("El número es múltiplo de 2 y de 3");
        }else if (numero % 3 ==0){
            System.out.println("El número es múltiplo de 3");
        }else if (numero % 2 == 0 ) {
            System.out.println("El número es múltiplo de 2");
        }
    }
}
