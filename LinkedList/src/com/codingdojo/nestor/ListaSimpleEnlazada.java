package com.codingdojo.nestor;

public class ListaSimpleEnlazada {
	public Nodo head;

	public ListaSimpleEnlazada() {
		this.head = null;
	}

	// Los métodos de SLL van aquí. Para empezar, te mostraremos cómo agregar un
	// nodo a la lista.
	public void add(int value) {
		Nodo newNodo = new Nodo(value);
		if (head == null) {
			head = newNodo;
		} else {
			Nodo runner = head;
			while (runner.next != null) {
				runner = runner.next;
			}
			runner.next = newNodo;
		}
	}

	public void remove() {
        if(head != null) {
        	Nodo runner = head;
        	while(runner.next.next !=null) {
        		runner=runner.next;
        	}
        	runner.next=null;
        }
    }
	
	public void printValues() {
		System.out.println();
        if(head != null) {
        	Nodo runner = head;
        	while(runner.next !=null) {
        		System.out.println(runner.value);
        		runner=runner.next;
        	}
        	System.out.println(runner.value);
        }
    }

}