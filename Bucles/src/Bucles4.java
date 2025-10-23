import java.util.Scanner;

public class Bucles4 {
    public static void main(String[] args) {

        //Realizar la suma del 1 al número que indiquemos, este debe ser mayor que 1.

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserte un número entero mayor que 1");
        int numero;

        do {
          numero = sc.nextInt();

          if (numero < 1){
              System.out.println("ERROR: introduzca un número entero mayor que 1");
          }

        }while (numero < 1);

        int suma = 0;

        for (int contador = 1; contador <=numero; contador++){

            suma += contador; // es lo mismo que suma = suma + contador
        }
        System.out.println("La suma es: " + suma);

    }
}
