import javax.xml.transform.Source;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca su primera hora");
        int hora1 = sc.nextInt();
        System.out.println("Introduzca los minutos");
        int minuto1 = sc.nextInt();
        System.out.println("Introduzca los segundos");
        int segundo1 = sc.nextInt();

        System.out.println("Introduzca su segunda hora");
        int hora2 = sc.nextInt();
        System.out.println("Introduzca los minutos");
        int minuto2 = sc.nextInt();
        System.out.println("introduzca los segundos");
        int segundo2 = sc.nextInt();

       // CONVERSIÓN DE HORAS
        long totalSegundos1 = (long)hora1 *3600 + (long)minuto1 * 60 + segundo1;
        long totalSegundos2 = (long)hora2 *3600 + (long)minuto2 * 60 + segundo2;

        if (totalSegundos1 > totalSegundos2){
            System.out.println("La primera hora es mayor que la segunda");

        } else if (totalSegundos1 < totalSegundos2) {
            System.out.println("La segunda hora es mayor que la primera");

        }else
            System.out.println("Amabas horas son iguales");
    }
}
