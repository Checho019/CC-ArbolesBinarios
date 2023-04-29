package org.example.trees;

public abstract class Arbol<T>{
    protected Nodo<T> raiz = null;

    public abstract void agregarNodo(T dato);
    public abstract void agregarNodo(Nodo<T> nodo);
    public abstract void eliminarNodo(Nodo<T> nodo);

    public Nodo<T> getRaiz(){
        return raiz;
    }

    public void setRaiz(Nodo<T> raiz){
        this.raiz = raiz;
    }
}
