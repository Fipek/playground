package com.fipek.playground.abstracts;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract public class ExtractorReport {

    public abstract Pattern getPattern();

    public abstract String getReportName();

    public abstract String format(String input);

    private String parse(String path) throws FileNotFoundException {
        StringBuilder out = new StringBuilder();

        File file = new File(path);
        Scanner scanner = new Scanner(file);

        if (scanner.hasNext()) {
            scanner.nextLine();
        } else {
            return "Empty File";
        }

        while (scanner.hasNext()) {
            String nextLine = scanner.nextLine();
            Matcher matcher = getPattern().matcher(nextLine);

            boolean matches = matcher.matches();

            if (matches) {
                out.append(format(nextLine)).append("\n");
            }
        }

        return out.toString().isBlank() ? "Empty file" : out.toString();
    }

    public void prepareAndSendReport(String path) throws FileNotFoundException{
        System.out.println("Starting report "+ getReportName() +"...");
        String report = parse(path);
        System.out.println(report);
        System.out.println("Sent report " + getReportName());
    }
}
