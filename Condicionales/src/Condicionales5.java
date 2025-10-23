//Ejercicio 5 de condicionales
//Media de 3 notas. Menor que cinco: insuficiente. 5: aprobado. 6:Bien. 7 y 8: notable. 9 y 10: sobresaliente

import java.util.Scanner;

public class Condicionales5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce las nota de tu 1º examen:");
        int nota1 = sc.nextInt();
        System.out.println("Introduce la nota de tu 2º examen:");
        int nota2 = sc.nextInt();
        System.out.println("Introduce la nota de tu 3º examen:");
        int nota3 = sc.nextInt();
        int media = (nota1 + nota2 + nota3)/3;

        System.out.println("Tu media es: " + media);

        if (media < 5){
            System.out.println("La media de tus exmanes es insuficiente :( ");
        }
        if (media == 5){
            System.out.println("La media de tus examenes esta aprobada raspado :|");
        }
        if (media ==6){
            System.out.println("La media de tus examenes esta bien");
        }
        if (media == 7 || media == 8){
            System.out.println("La media de tus examenes es de notable :)");
        }
        if (media == 9 || media == 10){
            System.out.println("La media de tus examenes es de sobresaliente ;) ");
        }
    }
}
