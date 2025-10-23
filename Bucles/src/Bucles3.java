public class Bucles3 {
    public static void main(String[] args) {

        //Mostrar números del 1 al 100 y mostrar tmb los que son divisibles entre 2 y 3

        for (int contador = 0; contador <=100; contador++){
            System.out.println(contador);

            if (contador % 2 == 0 && contador % 3 == 0){
                System.out.println(contador + " es divisor de 2 y 3 ");
            }
        }
    }
}
