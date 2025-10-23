import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el primer número");
        int numero1 = sc.nextInt();

        System.out.println("Introduzca el segundo número");
        int numero2 = sc.nextInt();
        double suma = numero1 + numero2;
        double resta = numero1 - numero2;
        double producto = numero1 * numero2;
        double cociente = numero1 / numero2;
        double resto = numero1 % numero2;

        System.out.println("Introduzca el carácter de operación");
        String caracter = sc.next();

        while(!caracter.equals("+") && !caracter.equals("-") && !caracter.equals("*") && !caracter.equals("/") && !caracter.equals("%")){
            System.out.println("ERROR: Introduzca un operador válido");
            caracter = sc.next();
        }

        if (caracter.equals("+")){
            System.out.println("La suma de sus números es igual a: " + suma);

        } else if (caracter.equals("-")) {
            System.out.println("La resta de sus números es igual a: " + resta);

        } else if (caracter.equals("*")) {
            System.out.println("El producto de sus números es igual a: " + producto);

        } else if (caracter.equals("/")) {
            System.out.println("El cociente de sus números es igual a: " + cociente);

        } else if (caracter.equals("%")) {
            System.out.println("El resto de sus números es igual a: " + resto);
        }
    }
}
