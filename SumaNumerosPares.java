public class SumaNumerosPares {
//imprimir los diez primeros numeros pares
public static void main(String[] args) {
    int suma = 0;
    for (int i = 1; i <= 20; i++) {
        if (i % 2 == 0) {
            suma = suma + i;
            System.out.println(i);
            

        }

    }
}

}
