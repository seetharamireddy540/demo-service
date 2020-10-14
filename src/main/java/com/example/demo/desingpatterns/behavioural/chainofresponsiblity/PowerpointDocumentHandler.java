package com.example.demo.desingpatterns.behavioural.chainofresponsiblity;

public class PowerpointDocumentHandler extends DocumentHandler {

    public PowerpointDocumentHandler(DocumentHandler next) {
        super(next);
    }

    public void handle(String fileExt) {
        if (fileExt.equals("ppt")) {
            System.out.printf("Powerpoint DocumentHandler processed.");
        } else {
            super.handle(fileExt);
        }
    }
}
