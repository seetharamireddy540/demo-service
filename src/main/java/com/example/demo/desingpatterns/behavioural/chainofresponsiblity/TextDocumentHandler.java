package com.example.demo.desingpatterns.behavioural.chainofresponsiblity;

public class TextDocumentHandler extends DocumentHandler {

    public TextDocumentHandler(DocumentHandler next) {
        super(next);
    }

    public void handle(String fileExt) {
        if (fileExt.equals("txt")) {
            System.out.printf("TextDocumentHandler processed.");
        } else {
            super.handle(fileExt);
        }
    }
}
