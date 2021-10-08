package edu.uaslp;

import edu.uaslp.list.List;
import edu.uaslp.list.arraylist.Arraylist;
import edu.uaslp.list.linkedlist.LinkedList;

public class Main {

    public static void main(String[] args) {

        List<Integer> libros = new LinkedList<>();
        List<Integer> alumnos = new Arraylist<>();

        libros.add(1);
        libros.add(3);
        libros.add(43);
        libros.add(32);

        alumnos.add(22);
        alumnos.add(23);

        libros.insert(77,0);
        libros.insert(88, 1);

        libros.delete(2);

        System.out.println("Libros size:" + libros.getSize());
        System.out.println("Alumnos size:" + alumnos.getSize());
        libros.print();
    }
}
