package com.fipek.playground.abstractExample;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberExtractorReport {

    public String parse(String path) throws FileNotFoundException {
        Pattern pattern = Pattern.compile("^[0-9]*$");
        StringBuilder out = new StringBuilder();

        File file = new File(path);
        Scanner scanner = new Scanner(path);

        if (scanner.hasNext()) {
            scanner.nextLine();
        } else {
            return "Empty File";
        }

        while (scanner.hasNext()) {
            String nextLine = scanner.nextLine();
            Matcher matcher = pattern.matcher(nextLine);

            boolean matches = matcher.matches();

            if (matches) {
                out.append(nextLine).append("\n");
            }
        }

        return out.toString().isBlank() ? "Empty file" : out.toString();
    }

    public void prepareAndSendReport(String path) throws FileNotFoundException{
        System.out.println("Starting report...");
        String report = parse(path);
        System.out.println(report);
        System.out.println("Sent report");
    }
}
