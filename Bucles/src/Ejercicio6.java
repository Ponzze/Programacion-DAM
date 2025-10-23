public class Ejercicio6 {
    public static void main(String[] args) {

        // Realizar un programa que calcule y muestre la suma de todos los números pares comprendidos entre 1 y 50

        //Creamos la variable que va a contar todos los números del 1 al 50
        int contador;
        //Creamos la variable que va a sumar los pares comprendido en el intervalo
        int sumaPares = 0;

        //Creamos el bucle que va a establecer el intervalo del contador (1-50)
        for (contador = 1; contador <= 50; contador++){

            //Establecemos la condición para que solo sume los números pares dentro del intervalo
            if (contador % 2 == 0){
              sumaPares += contador;
            }
        }
        //Hacemos que imprima un mensaje junto con el resultado de la suma de números pares del intervalo
        System.out.println("La suma de los números pares entre el 1 y el 50 es: " + sumaPares);
    }
}
