import java.util.Scanner;

public class Ejercicio4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca su edad");
        int edad = sc.nextInt();

        if (edad <= 12){
            System.out.println("Eres un nene");
        } else if (edad >= 13 && edad <=17){
            System.out.println("Eres un adolescente");
        }else if (edad >=18 && edad <= 29){
            System.out.println("Eres un jóven");
        }else if (edad >29 && edad <=99){
            System.out.println("Eres un adulto");
        }else if (edad >100 && edad <=110){
            System.out.println("Tienes mas años que un bosque ");
        }else if (edad >110){
            System.out.println("Error: porfavor introduce un valor válido");
        }
    }
}
