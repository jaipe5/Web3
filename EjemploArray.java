public class EjemploArray {
    public static void main(String[] args) {
        // Declarar un array de enteros con 5 elementos
        int[] numeros = new int[5];

        // Asignar valores a los elementos del array
        numeros[0] = 10;
        numeros[1] = 20;
        numeros[2] = 30;
        numeros[3] = 40;
        numeros[4] = 50;

        // Imprimir los elementos del array
        System.out.println("Elementos del array:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        // Calcular la suma de los elementos del array
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        System.out.println("La suma de los elementos del array es: " + suma);

        // Buscar el elemento máximo del array
        int maximo = numeros[0];
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
        }
        System.out.println("El elemento máximo del array es: " + maximo);
    }
}

