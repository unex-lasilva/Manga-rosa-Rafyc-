package br.com.mangarosa.datastructures.abstractClasses;

public class QueueNodeMessage {
    // Próximo nó na fila
    private QueueNodeMessage next; // Próximo nó
// Retorna o próximo nó na fila
    public QueueNodeMessage getNext() {
        return this.next; // Retorna o próximo nó
    }
// retorna o próximo nó e define o próximo nó
    public void setNext(QueueNodeMessage next) {
        this.next=next;
}
// Define o próximo nó
}
