import java.util.Locale;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su estado civil");
        String estadoCivil = sc.nextLine().toLowerCase(Locale.ROOT);

        System.out.println("Introduzca su edad");
        int edad = sc.nextInt();

        if ((estadoCivil.equals("soltero") || estadoCivil.equals("divorciado"))&& edad < 35){
            System.out.println("Su porcentaje de retención es de un 12%");

        } else if (edad > 50) {
            System.out.println("Su porcetaje de retención es de un 8,5%");

        } else if ((estadoCivil.equals("viudo") || estadoCivil.equals("casado")) && edad < 35) {
            System.out.println("Su porcentaje de retención es de un 11,3%");

        }else
            System.out.println("Su porcentaje de retención es de un 10,5%");
    }
}
