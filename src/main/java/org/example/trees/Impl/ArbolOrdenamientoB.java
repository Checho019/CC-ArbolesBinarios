package org.example.trees.Impl;

import java.util.ArrayList;

import org.example.trees.Nodo;
import org.example.trees.binary.ArbolBInario;

public class ArbolOrdenamientoB <T extends Comparable> extends ArbolBInario<T> {

    private ArrayList<Nodo> nodos = new ArrayList<Nodo>();
    public ArrayList<Nodo> getNodos(){
        return nodos;
    }

    public void setNodos( ArrayList<Nodo> nodos){
        this.nodos = nodos;
    }

    @Override
    public void agregarNodo(T dato) {
        NodoOrdenamientoB<T> nuevo = new NodoOrdenamientoB<>(dato);
        agregarNodo(nuevo);
    }

    @Override
    public void agregarNodo(Nodo<T> nodo){
        if (raiz != null){
            raiz.agregarNodo(nodo);
        } else {
            raiz = nodo;
        }
        getNodos().add(nodo);
    }

    public Nodo buscar(T dato){
        for(Nodo nodo: nodos) {
            if (nodo.getDato().equals(dato)){
                return nodo;
            }
        }
        return null;
    }

    @Override
    public void eliminarNodo(Nodo<T> nodo){
        Nodo candidato = nodo.getNodosHijos().get(0);
        if(candidato == null) {
            candidato = nodo.getNodosHijos().get(1);

            // Nodo objetivo es una hoja
            if (candidato == null){
                if (nodo.getPadre().getNodosHijos().get(0).equals(nodo)){
                    nodo.getPadre().getNodosHijos().set(0,null);
                } else {
                    nodo.getPadre().getNodosHijos().set(1,null);
                }

            } else {
                candidato.setPadre(nodo.getPadre());
                if (candidato.getPadre() != null) {
                    candidato.getPadre().getNodosHijos().set(candidato.getPadre().getNodosHijos().indexOf(nodo), candidato);
                } else {
                    this.setRaiz(candidato);
                }
                return;
            }

        }else {
            while(candidato.getNodosHijos().get(1)!=null) {
                candidato = (Nodo) candidato.getNodosHijos().get(1);
            }
        }
        if (candidato.getPadre().getNodosHijos().indexOf(candidato) == 0){
            candidato.getPadre().getNodosHijos().set(0,candidato.getNodosHijos().get(0));
        } else {
            candidato.getPadre().getNodosHijos().set(1,candidato.getNodosHijos().get(0));
        }
        candidato.setPadre(nodo.getPadre());
        candidato.setNodosHijos(nodo.getNodosHijos());
        if (candidato.getPadre() != null){
            candidato.getPadre().getNodosHijos().set(candidato.getPadre().getNodosHijos().indexOf(nodo), candidato);
        } else {
            this.setRaiz(candidato);
        }
    }
}
