package org.ieslosremedios.daw1.prog.UT5.EjerciciosClase;

import java.util.*;

public class EjemploArrayList {
    public static void main(String[] args) {
        // Crear ArrayList y añadir elementos
        List<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add(null);
        System.out.println(cars);

        //Acceder a un elemento
        System.out.println(cars.get(2));

        //Cambiar elemento 1 por Renault
        cars.set(1,"Renault");

        //Eliminar "Mazda"
        cars.remove("Mazda");

        //Entre Renault y Ford, añadimos un Opel
        cars.add(2,"Opel");
        System.out.println(cars);

        //Vaciamos la lista, comprobamos que está vacío, y comprobamos
        // que el tamaño es 0
        cars.clear();
        System.out.println(cars.size());
        System.out.println(cars);

        //Creamos un conjunto donde estén Mitsubichi y Toyota
        //y lo añadimos a la lista anterior
        SortedSet<String>coches2=new TreeSet<>();
        coches2.add("Mitsubichi");
        coches2.add("Toyota");
        cars.addAll(coches2);
        System.out.println(cars);

        //ListIterator
        ListIterator it= cars.listIterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        while (it.hasPrevious()){
            System.out.println(it.hasPrevious());
        }

    }
}
