package com.example.demo.desingpatterns.behavioural.chainofresponsiblity;

public class SpreadSheetDocumentHandler extends DocumentHandler {

    public SpreadSheetDocumentHandler(DocumentHandler next) {
        super(next);
    }

    public void handle(String fileExt) {
        if (fileExt.equals("xslt")) {
            System.out.printf("SpreadSheetDocumentHandler processed.");
        } else {
            super.handle(fileExt);
        }
    }
}
