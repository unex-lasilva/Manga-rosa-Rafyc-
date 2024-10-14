package br.com.mangarosa.messages.producers;
// Retém uma mesagem de texto até obter seu conteúdo
public class Message {
    private String content;

    public Message(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return content + '\'';
    }

    public String getMessage() {
        return content;
    }
}