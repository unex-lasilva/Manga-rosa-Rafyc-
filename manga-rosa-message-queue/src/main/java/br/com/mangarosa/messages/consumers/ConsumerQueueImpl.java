package br.com.mangarosa.messages.consumers;

import br.com.mangarosa.datastructures.interfaces.impl.LinkedQueue;
import br.com.mangarosa.messages.producers.Message;

/**
 * Classe que representa um consumidor de mensagens em uma fila.
 */
public class ConsumerQueueImpl {
    // Fila de mensagens
    private final LinkedQueue messageQueue;

    /**
     * Construtor da classe ConsumerQueueImpl.
     *
     * @param messageQueue a fila de mensagens a ser consumida
     */
    public ConsumerQueueImpl(LinkedQueue messageQueue) {
        this.messageQueue = messageQueue;
    }

    /**
     * Consome uma mensagem da fila.
     * Se a fila não estiver vazia, remove e imprime a mensagem.
     * Caso contrário, imprime uma mensagem indicando que a fila está vazia.
     */
    public void consume() {
        if (!messageQueue.isEmpty()) {
            Message message = messageQueue.dequeue();
            System.out.println("Consumido: " + message);
        } else {
            System.out.println("A fila está vazia, não há itens para consumo.");
        }
    }
}

