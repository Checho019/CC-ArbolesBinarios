package org.example.trees.binary;

import org.example.trees.Nodo;

public abstract class NodoBinario <T> extends Nodo {

    public NodoBinario (T dato){
        super(dato);
        this.nodosHijos.add(null);
        this.nodosHijos.add(null);
    }

    public NodoBinario (T dato, Nodo<T> padre){
        super(dato, padre);
        this.nodosHijos.add(null);
        this.nodosHijos.add(null);
    }

    @Override
    public String toString(){
        return dato.toString();
    }

    public void recorridoPrefijo(){
        System.out.println(this.toString());
        if (getNodosHijos().get(0) != null){
            ((NodoBinario) getNodosHijos().get(0)).recorridoPrefijo();
        }
        if (getNodosHijos().get(1) != null){
            ((NodoBinario) getNodosHijos().get(1)).recorridoPrefijo();
        }
    }

    public void recorridoInfijo(){
        if (getNodosHijos().get(0) != null){
            ((NodoBinario) getNodosHijos().get(0)).recorridoInfijo();
        }
        System.out.println(this.toString());
        if (getNodosHijos().get(1) != null){
            ((NodoBinario) getNodosHijos().get(1)).recorridoInfijo();
        }
    }

    public void recorridoPosfijo(){
        if (getNodosHijos().get(0) != null){
            ((NodoBinario) getNodosHijos().get(0)).recorridoPosfijo();
        }
        if (getNodosHijos().get(1) != null){
            ((NodoBinario) getNodosHijos().get(1)).recorridoPosfijo();
        }
        System.out.println(this.toString());

    }
}
