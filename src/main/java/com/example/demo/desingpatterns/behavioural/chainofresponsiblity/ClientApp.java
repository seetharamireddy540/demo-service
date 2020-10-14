package com.example.demo.desingpatterns.behavioural.chainofresponsiblity;

import java.time.ZonedDateTime;

public class ClientApp {
    public static void main(String[] args) {

        DocumentHandler handler = new PowerpointDocumentHandler(new SpreadSheetDocumentHandler(new TextDocumentHandler(null)));
        handler.handle("ppt");
    }
}
