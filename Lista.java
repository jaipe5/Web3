import java.util.Random;
public class Lista {
public static void main(String[] args) {

int[] numeros = new int[10];
Random aleatorio = new Random();

for (int i = 0; i < numeros.length; i++) {
    numeros[i] = aleatorio.nextInt(20) + 1;
}

for (int i = 0; i < numeros.length; i++) {
    System.out.println(numeros[i]);
}
}
}