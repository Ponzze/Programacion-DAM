import java.util.Scanner;
//Ejercicio 3 de condicionales
//Realizar un programa que al introducir un número del 1 al 7 nos indique a que día de la semana corresponde

public class Condicionales3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un número del 1 al 7");
        int numero = sc.nextInt();

        //Para indicar una igualdad se utiliza ==

        if (numero == 1 ){
            System.out.println("El dia de la semana es Lunes");
        }
        if (numero == 2){
            System.out.println("El dia de la semana es Martes");
        }
        if (numero == 3){
            System.out.println("El dia de la semana es Miércoles");
        }
        if (numero == 4){
            System.out.println("El día de la semana es Jueves");
        }
        if (numero == 5){
            System.out.println("El dia de la semana es Viernes");
        }
        if (numero == 6){
            System.out.println("El día de la semana es Sábado");
        }
        if (numero == 7){
            System.out.println("El día de la semana es Domingo");
        }
        if (numero >= 8){
            System.out.println("ERROR: el número introducido no es válido");
        }

    }
}
