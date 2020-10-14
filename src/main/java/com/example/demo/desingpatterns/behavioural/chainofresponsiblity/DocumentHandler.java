package com.example.demo.desingpatterns.behavioural.chainofresponsiblity;

public abstract class DocumentHandler {

    private final DocumentHandler next;

    public DocumentHandler(DocumentHandler next) {
        this.next = next;
    }

    public void handle(String fileExt) {
        if (this.next != null) {
            this.next.handle(fileExt);
        }
    }
}
