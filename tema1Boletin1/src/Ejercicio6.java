import java.util.Locale;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una letra");
        String letra = sc.nextLine().toLowerCase(Locale.ROOT);


        if (letra.equals("a")) {
            System.out.println("Su letra es la primera vocal (a)");

        }else if (letra.equals("e")) {
            System.out.println("Su letra es la segunda vocal (e)");

        } else if (letra.equals("i")){
            System.out.println("Su letra es la tercera vocal (i)");

        } else if (letra.equals("o")) {
            System.out.println("Su letra es la cuarta vocal (o)");

        } else if (letra.equals("u")) {
            System.out.println("Su letra es la quinta vocal (u)");

        }else
            System.out.println("Su letra no es una vocal");
    }

    }
