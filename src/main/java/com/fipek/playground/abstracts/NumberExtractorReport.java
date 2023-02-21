package com.fipek.playground.abstracts;

import java.util.regex.Pattern;

public class NumberExtractorReport extends ExtractorReport {

    private static final Pattern PATTERN = Pattern.compile("^[0-9]*$");

    @Override
    public Pattern getPattern() {
        return PATTERN;
    }

    @Override
    public String getReportName() {
        return "Phone Numbers";
    }

    @Override
    public String format(String input) {
        return input;
    }
}
