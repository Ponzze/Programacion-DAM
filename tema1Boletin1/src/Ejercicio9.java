import java.util.Locale;
import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tipoProducto;

        do {
            System.out.println("Introduzca su tipo de producto (A,B o C)");
            tipoProducto = sc.nextLine().toLowerCase();

            if (!tipoProducto.equals("a") && !tipoProducto.equals("b") && !tipoProducto.equals("c")){
                System.out.println("Introduzca un tipo de producto válido");
            }

        }while (!tipoProducto.equals("a") && !tipoProducto.equals("b") && !tipoProducto.equals("c"));


        System.out.println("Indique el precio original del producto");
        double originalPrecio = sc.nextDouble();
        double descuento1 = originalPrecio - (originalPrecio * 0.07);
        double descuento2 = originalPrecio - (originalPrecio * 0.12);
        double descuento3 = originalPrecio - (originalPrecio * 0.09);

        if (tipoProducto.equals("a")){
            System.out.println("A su producto se le aplicara un 7% de descuento, por lo que se le queda en: " + descuento1 + " euros");

        } else if ((tipoProducto.equals("c") || originalPrecio < 500)) {
            System.out.println("A su producto se le aplicará un 12% de descuento, por lo que se le queda en: " + descuento2 + " euros");

        }else
            System.out.println("A su producto se le aplicará un 9% de descuento, por lo que se le queda en: " + descuento3 + " euros");
    }

}
