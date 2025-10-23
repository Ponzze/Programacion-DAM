import java.util.Scanner;

//Ejercicio 2 de condicionales
//Pedir una hora por teclado. De 6 a 12 mandar mensaje de buenos días. De 13 a 20 buenas tardes y de 21 a 5 buenas noches

public class Condicionales2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica que hora es");
        int hora = sc.nextInt();

        // && significa "Y"
        if (hora >= 6 && hora <= 12){
            System.out.println("Buenos días");
        }
       if (hora >=13 && hora <=20) {
           System.out.println("Buenas tardes");
       }
       if (hora>=0 && hora <= 5){
           System.out.println("Buenas noches ");
       }
       if (hora >= 25){
           System.out.println("ERROR: introduce una hora válida");
       }

    }
}
