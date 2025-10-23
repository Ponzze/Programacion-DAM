import java.util.Scanner;
// Ejercicio 1 de condicionales
// Escribir un día por teclado y que diga que asignatura toca a primera hora de ese día
// Si el día no es válido, que aparezca un mensaje de error

public class Condicionales1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el día de la semana");
        String dia = sc.nextLine();

        // || significan "o"
        if (dia.equals("lunes") || dia.equals("Lunes")) {
            System.out.println("El lunes a primera hora tienes matemáticas");
        }

        if (dia.equals("martes") || dia.equals("Martes")) {
            System.out.println("El martes a primera hora tienes inglés");
        }

        if (dia.equals("miercoles") || dia.equals("Miercoles")) {
            System.out.println("El miércoles a primera hora tienes Historia");
        }

        if (dia.equals("jueves") || dia.equals("Jueves")) {
            System.out.println("El jueves a priemra hora tienes biología");
        }

        if (dia.equals("viernes") || dia.equals("Viernes")) {
            System.out.println("El viernes a primera hora tienes literatura");
        }

        if (dia.equals("sabado") || dia.equals("domingo") || dia.equals("Sabado") || dia.equals("Domingo")) {
            System.out.println("No tienes clase el fin de semana");
        }
        // && significan "y"
        //se usa ! para indicar que algo es distinto a ...
        if (!dia.equals("Lunes") && !dia.equals("Martes") && !dia.equals("Miercoles") && !dia.equals("Jueves") && !dia.equals("Viernes")
                &&!dia.equals("lunes") && !dia.equals("martes") && !dia.equals("miercoles") && !dia.equals("jueves") &&!dia.equals("viernes")) {
            System.out.println("EROR: Día no reconocido, porfavor intentelo de nuevo");
        }

    }
}
