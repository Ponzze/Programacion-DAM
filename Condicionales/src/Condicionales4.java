import java.util.Scanner;

//Ejercicio 4 de condicionales
//Salario de trabajador. Cobra 12 euros la hora. A partir de la hora 41 cobra 16
public class Condicionales4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el número de horas");
        int hora = sc.nextInt();


        if (hora <= 40){
            System.out.println("El salario total es de " + (hora * 12));
        }
        if (hora >= 41){
            System.out.println("El salario total es de " + (480 +((hora - 40) * 16)));
        }

    }
}
