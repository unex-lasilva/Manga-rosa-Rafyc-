package br.com.mangarosa.messages.producers;

import br.com.mangarosa.datastructures.interfaces.impl.LinkedQueue;
//cria fila de mensagens e adiciona novas mensagens a fila
public class ProducerQueueImpl {
    private final LinkedQueue messageQueue;

    public ProducerQueueImpl(LinkedQueue messageQueue) {
        this.messageQueue = messageQueue;
    }

    public void sendMessage(String content) {
        Message message = new Message(content);
        messageQueue.enqueue(message);
        System.out.println("Produzido: " + message);
    }
}
