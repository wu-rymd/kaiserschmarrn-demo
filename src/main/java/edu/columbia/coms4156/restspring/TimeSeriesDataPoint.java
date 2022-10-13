package edu.columbia.coms4156.restspring;

import java.util.Date;

public class TimeSeriesDataPoint {
    private final Date date;
    private final double price;

    public TimeSeriesDataPoint(Date date, double price) {
        this.date = date;
        this.price = price;
    }

    public Date getDate() {
        return date;
    };

    public double getPrice() {
        return price;
    }
}