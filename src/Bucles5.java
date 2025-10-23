import java.util.Scanner;

public class Bucles5 {
    public static void main(String[] args) {
        
        //Crear un programa que permita insertar números hasta que se inserte un -1

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce los números que desee, si introduce el -1, el programa finalizará");
        int numero;

        do {
            numero = sc.nextInt();
        }while(numero != -1);

        System.out.println("El programa finalizó");
    }
}
