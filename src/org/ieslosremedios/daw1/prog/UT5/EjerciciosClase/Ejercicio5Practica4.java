package org.ieslosremedios.daw1.prog.UT5.EjerciciosClase;

public class Ejercicio5Practica4 {
    public static void main(String[] args) {
        String texto = "Escribe el código de un programa que dado el contenido de un texto y una determinada palabra, realice búsquedas de la palabra dentro de él. La secuencia de ejecución será: crear un texto, crear una palabra, invocar al método con estos parámetros, buscar número de ocurrencias de la palabra en texto, obtener la salida del método y mostrar por pantalla el número de apariciones de la palabra.";
        String palabra = "de";
        //System.out.print("Escriba un texto: " + texto);
        //System.out.print("Escriba la palabra en el buscador: " + palabra);
        int numero = busquedaNumero(texto, palabra);
        System.out.println("La palabra '" + palabra + "' aparece " + numero + " veces en el texto.");
        texto.replace('e','3');
        System.out.println(texto);
    }

    private static int busquedaNumero(String texto, String palabra) {
        int count = 0;
        String [] ejer=texto.split(" |,|;|\\.");
        for (int i = 0; i < ejer.length; i++) {
            if (ejer[i].equalsIgnoreCase(palabra)){
                count++;
            }
        }
        return count;
    }
}
