import java.util.Random;
public class ListaUno {
    public static void main(String[] args) {
    Random rand = new Random();
      // Declarar un array de enteros con 10 elementos   
    int[] numeros = new int[10];
   
// Asignar valores a los elementos del array
numeros[0] = rand.nextInt(20) + 1;
numeros[1] = rand.nextInt(20) + 1;
numeros[2] = rand.nextInt(20) + 1;
numeros[3] = rand.nextInt(20) + 1;

System.out.println(numeros[1]);

}
}
