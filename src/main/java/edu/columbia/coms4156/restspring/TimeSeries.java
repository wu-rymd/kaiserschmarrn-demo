package edu.columbia.coms4156.restspring;

import java.util.ArrayList;

public class TimeSeries {
    private final ArrayList<TimeSeriesDataPoint> prices;

    public TimeSeries(ArrayList<TimeSeriesDataPoint> prices) {
        this.prices = prices;
    }

    public ArrayList<TimeSeriesDataPoint> getPrices() {
        return prices;
    }
}
