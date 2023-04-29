package org.example;

import org.example.trees.Impl.ArbolOrdenamientoB;

public class Main {
    public static void main(String[] args) {

        // El arbol no agrega valores repetidos
        // El ejemplo fue tomado de las diapositivas disponibles en el aula virtual
        ArbolOrdenamientoB<Integer> aob = new ArbolOrdenamientoB<>();
        aob.agregarNodo(14);
        aob.agregarNodo(15);
        aob.agregarNodo(4);
        aob.agregarNodo(9);
        aob.agregarNodo(7);
        aob.agregarNodo(18);
        aob.agregarNodo(3);
        aob.agregarNodo(5);
        aob.agregarNodo(16);
        aob.agregarNodo(4);
        aob.agregarNodo(20);
        aob.agregarNodo(17);
        aob.agregarNodo(9);
        aob.agregarNodo(14);
        aob.agregarNodo(5);

        System.out.println("------- Prefijo ------");
        aob.recorridoPrefijo();
        System.out.println("------ Infijo -------");
        aob.recorridoInfijo();
        System.out.println("------- Posfijo ------");
        aob.recorridoPosfijo();

        aob.eliminarNodo(aob.buscar(4));
        System.out.println("Eliminacion del nodo 4");

        System.out.println("------- Prefijo ------");
        aob.recorridoPrefijo();
        System.out.println("------ Infijo -------");
        aob.recorridoInfijo();
        System.out.println("------- Posfijo ------");
        aob.recorridoPosfijo();

    }
}