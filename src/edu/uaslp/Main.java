package edu.uaslp;

import edu.uaslp.list.linkedlist.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList libros = new LinkedList();
        LinkedList alumnos = new LinkedList();

        libros.add(1);
        libros.add(3);
        libros.add(43);
        libros.add(32);

        alumnos.add(22);
        alumnos.add(234);

        System.out.println("Libros size: " + libros.getSize());
        System.out.println("Alumnos size: " + alumnos.getSize());

        System.out.println("Libro en posicion 3: " + libros.get(3));


        for(int i = 0; i < libros.getSize(); i++) {
            System.out.println("El dato en " + i + " es: " + libros.get(i));
        }

        libros.insert(77,3);
        libros.insert(99,4);

        System.out.println("---------------------");

        for(int i = 0; i < libros.getSize(); i++) {
            System.out.println("El dato en " + i + " es: " + libros.get(i));
        }

        libros.delete(0);

        System.out.println("---------------------");

        for(int i = 0; i < libros.getSize(); i++) {
            System.out.println("El dato en " + i + " es: " + libros.get(i));
        }
    }
}
