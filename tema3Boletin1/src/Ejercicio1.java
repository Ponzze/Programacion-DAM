public class Ejercicio1 {
    static void main() {
        int[] array = {4,6,7,3,1};
        System.out.println(sumaPares(array));
    }
    private static int sumaPares(int[] array){
        int suma = 0;
        for (int i = 0; i < array.length; i +=2){
         suma +=array[i];
        }
        return suma;
    }
}
