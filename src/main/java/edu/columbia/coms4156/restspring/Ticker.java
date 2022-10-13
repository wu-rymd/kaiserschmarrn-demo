package edu.columbia.coms4156.restspring;

public class Ticker {
    private final String symbol;
    private final TimeSeries timeSeries;

    public Ticker(String symbol, TimeSeries timeSeries) {
        this.symbol = symbol;
        this.timeSeries = timeSeries;
    }

    public String getSymbol() {
        return symbol;
    }

    public TimeSeries getTimeSeries() {
        return timeSeries;
    }
}