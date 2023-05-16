package org.classes.dynamic;

import org.classes.definition.IStack;

public class Stack <T> implements IStack<T> {

    private Node<T> first;

    @Override
    public void add(T a) {
        this.first = new Node<T>((T)a, this.first);
    }

    @Override
    public void remove() {
        if(this.first == null) {
            System.out.println("No se puede desapilar una pila vacia");
            return;
        }
        this.first = this.first.getNext();
    }

    @Override
    public boolean isEmpty() {
        return this.first == null;
    }

    @Override
    public Node<T> getTop() throws Exception {
        if(this.first == null) {
            System.out.println("No se puede obtener el tope una pila vacia");
            throw new Exception();
        }
        return this.first;
    }
}
