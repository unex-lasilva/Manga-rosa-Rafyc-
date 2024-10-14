package br.com.mangarosa.datastructures.abstractClasses;

import br.com.mangarosa.messages.producers.Message;

/**
 * Classe que representa um nó em uma fila encadeada.
 */
public class QueueNode {
    // Valor armazenado no nó
    private Message value;
    // Próximo nó na fila
    private QueueNode next;

    /**
     * Construtor da classe QueueNode.
     *
     * @param value o valor a ser armazenado no nó
     */
    public QueueNode(Message value) {
        this.value = value;
        this.next = null;
    }

    /**
     * Retorna o valor armazenado no nó.
     *
     * @return o valor armazenado no nó
     */
    public Message getValue() {
        return value;
    }

    /**
     * Define o valor armazenado no nó.
     *
     * @param value o valor a ser armazenado no nó
     */
    public void setValue(Message value) {
        this.value = value;
    }

    /**
     * Retorna o próximo nó na fila.
     *
     * @return o próximo nó na fila
     */
    public QueueNode getNext() {
        return next;
    }

    /**
     * Define o próximo nó na fila.
     *
     * @param next o próximo nó a ser definido
     */
    public void setNext(QueueNode next) {
        this.next = next;
    }
}
