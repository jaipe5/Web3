public class ArrayResumen {
    //Declarar e inicializar un array
    
    int[] numeros = new int[5]; // Array de 5 elementos
    String[] palabras = {"hola", "mundo", "en", "Java"}; // Array de 4 elementos
    
    //Acceder a los elementos de un array
   
    int primerNumero = numeros[0]; // Acceder al primer elemento
    String segundaPalabra = palabras[1]; // Acceder al segundo elemento
    
    //Asignar un valor a un elemento de un array
    
    numeros[0] = 10; // Asignar el valor 10 al primer elemento
    palabras[1] = "mundo!"; // Asignar el valor "mundo!" al segundo elemento
    
    //Recorrer un array con un bucle for
   
    for (int i = 0; i < numeros.length; i++) {
        System.out.println("Elemento " + i + ": " + numeros[i]);
    }
    
    for (String palabra : palabras) {
        System.out.println(palabra);
    }
    
    //Encontrar el valor máximo de un array
    
    int maximo = numeros[0];
    for (int i = 1; i < numeros.length; i++) {
        if (numeros[i] > maximo) {
            maximo = numeros[i];
        }
    }
    System.out.println("El valor máximo es: " + maximo);
    
    //Ordenar un array
    
    Arrays.sort(numeros);
    for (int numero : numeros) {
        System.out.println(numero);
    } 
}
