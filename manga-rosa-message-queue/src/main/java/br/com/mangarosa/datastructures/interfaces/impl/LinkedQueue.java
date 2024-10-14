package br.com.mangarosa.datastructures.interfaces.impl;

import br.com.mangarosa.messages.producers.Message;
import java.util.Iterator;
import java.util.NoSuchElementException;
import br.com.mangarosa.datastructures.abstractClasses.QueueNode;
// representa uma fila encadeada com referências ao primeiro e ao último nó, além de um campo para armazenar o tamanho da fila.
public class LinkedQueue {
    private QueueNode firstNode;
    private QueueNode lastNode;
    private int size;

    public LinkedQueue() {
        this.firstNode = null;
        this.lastNode = null;
        this.size = 0;
    }
// adiciona uma nova mensagem ao final da fila. Se a fila estiver vazia, o novo nó se torna tanto o primeiro quanto o último nó
    public void enqueue(Message message) {
        QueueNode newNode = new QueueNode(message);

        if (size == 0) {
            firstNode = newNode;
            lastNode = newNode;
        } else {
            lastNode.setNext(newNode);
            lastNode = newNode;
        }
        size++;
    }
// Verifica se o primeiro nó está vazio e retorna a mensgaem que está vazio
    public Message dequeue() {
        if (firstNode == null) {
            throw new IllegalStateException("A fila está vazia.");
        }
// Verifica se o primeiro nó é nulo
        Message message = firstNode.getValue();
        firstNode = firstNode.getNext();

        if (firstNode == null) {
            lastNode = null;
        }
        size--;
        return message;
    }
// Visualizar a primeira mensagem sem remover a mesma, caso esteja vazia ele acusa que está vazia
    public Message peek() {
        if (firstNode == null) {
            throw new IllegalStateException("A fila está vazia.");
        }
        // retorna o primeiro nó
        return firstNode.getValue();
    }
// Define três métodos que manipulam e verificam a estrtura
    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }

    public void clear() {
        firstNode = null;
        lastNode = null;
        size = 0;
    }
// Cria um interador começa no primeir nó e retorna cada mensagem até o uúltimo nó
    public Iterator<Message> iterator() {
        return new Iterator<>() {
            private QueueNode current = firstNode;

            @Override
            public boolean hasNext() {
                return current != null;
            }

            @Override
            public Message next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Message message = current.getValue();
                current = current.getNext();
                return message;
            }
        };
    }
}