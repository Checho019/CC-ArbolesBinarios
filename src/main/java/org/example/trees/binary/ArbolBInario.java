package org.example.trees.binary;

import org.example.trees.Arbol;
import org.example.trees.Nodo;

public abstract class ArbolBInario <T> extends Arbol <T> {

    public void recorridoPrefijo(){
        if (raiz != null){
            ((NodoBinario)raiz).recorridoPrefijo();
        }
    }
    public void recorridoInfijo(){
        if(raiz != null){
            ((NodoBinario)raiz).recorridoInfijo();
        }
    }

    public void recorridoPosfijo(){
        if (raiz != null){
            ((NodoBinario)raiz).recorridoPosfijo();
        }
    }
}
