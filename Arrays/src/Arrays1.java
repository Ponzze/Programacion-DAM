public class Arrays1 {
    static void main() {
        //Se declara un array de tamaño 4
        String[] ciudades;
        ciudades = new String[4];
        // Se le asigana un valor a los elementos del array
        ciudades[0] = "Madrid";
        ciudades[1] = "Barcelona";
        ciudades[2] = "Huelva";
        ciudades[3] = "Cádiz";
        // Se pide que muestre el segundo elemento del array
        System.out.println("La segunda ciudad es: " + ciudades[1]);
        // Mostrar el ultimo elemento (indice lenght - 1)
        int indiceUltima = ciudades.length - 1;
        System.out.println("La última ciudad es: " + ciudades[indiceUltima]);


    }
}
