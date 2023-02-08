package org.ieslosremedios.daw1.prog.UT5.EjerciciosClase;

import java.util.Iterator;
import java.util.TreeSet;

public class EjercicioTreeSet {
    public static void main(String[] args) {
        //Crea un conjunto implementado por un árbol binario
        TreeSet<Integer> arbolBi=new TreeSet<>();

        //Añade tres números enteros en orden aleatorio
        arbolBi.add(5);
        arbolBi.add(1);
        arbolBi.add(14);

        //Recorrelo e imprime su contenido ordenado de menor a mayor
        Iterator<Integer>it=arbolBi.iterator();
        System.out.print("[");
        while (it.hasNext()){
            System.out.print(it.next()+", ");
        }
        System.out.print("]");

        // Haz lo mismo utilizando nombre de alumnos
        TreeSet<String>arbolString=new TreeSet<>();
        arbolString.add("Paco");
        arbolString.add("Matias");
        arbolString.add("Pedro");
        arbolString.add("Adrian");

        Iterator<String> iter=arbolString.iterator();
        System.out.println("");
        System.out.print("[");
        while (iter.hasNext()){
            System.out.print(iter.next()+", ");
        }
        System.out.print("]");

        // Haz lo mismo con objetos de la clase persona
    }
}
