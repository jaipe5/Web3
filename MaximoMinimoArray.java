public class MaximoMinimoArray {
    public static void main(String[] args) {
        int[] numeros = {5, 3, 8, 2, 7};

int maximo = numeros[0];
int minimo = numeros[0];

for (int i = 1; i < numeros.length; i++) {
    if (numeros[i] > maximo) {
        maximo = numeros[i];
    }
    if (numeros[i] < minimo) {
        minimo = numeros[i];
    }
}

System.out.println("El número máximo es: " + maximo);
System.out.println("El número mínimo es: " + minimo);


    }
}
