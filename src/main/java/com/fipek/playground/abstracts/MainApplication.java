package com.fipek.playground.abstracts;

import java.io.FileNotFoundException;

public class MainApplication {
    public static void main(String[] args) throws FileNotFoundException {
        String path = "src/main/resources/data.txt";

        new NumberExtractorReport().prepareAndSendReport(path);

        new EmailExtractorReport().prepareAndSendReport(path);
    }
}
