package br.com.mangarosa;

import br.com.mangarosa.datastructures.interfaces.impl.LinkedQueue;
import br.com.mangarosa.messages.consumers.ConsumerQueueImpl;
import br.com.mangarosa.messages.producers.ProducerQueueImpl;

public class Main {
    public static void main(String[] args) {
        // Criar a fila de mensagens
        LinkedQueue messageQueue = new LinkedQueue();

        // Criar o produtor e consumidor
        ProducerQueueImpl producer = new ProducerQueueImpl(messageQueue);
        ConsumerQueueImpl consumer = new ConsumerQueueImpl(messageQueue);

        // Enviar mensagens para a fila
        producer.sendMessage("1 - Filé com fritas e suco de uva");
        producer.sendMessage("2 -  2 Hámburgers e refrigerante de 1L");
        producer.sendMessage("3 -O Resultado do exame Código 2770, está pronto!");

        // Consumir mensagens da fila
        consumer.consume();
        consumer.consume();
        consumer.consume();

        // Tentar consumir quando a fila estiver vazia
        consumer.consume();
    }
}