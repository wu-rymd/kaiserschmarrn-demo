package edu.columbia.coms4156.restspring;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TickerController {
    @GetMapping("/api/{symbol}")
    public Ticker getTicker(@PathVariable String symbol) {
        
        // use the same data for all symbols -- year is offset from 1900
        TimeSeriesDataPoint point1 = new TimeSeriesDataPoint(new Date(122,01,01), 123.45);
        TimeSeriesDataPoint point2 = new TimeSeriesDataPoint(new Date(122,01,02), 234.56);
        TimeSeriesDataPoint point3 = new TimeSeriesDataPoint(new Date(122,01,03), 345.67);
        ArrayList<TimeSeriesDataPoint> prices = new ArrayList<TimeSeriesDataPoint>(List.of(point1, point2, point3));

        TimeSeries timeSeries = new TimeSeries(prices);

        return new Ticker(symbol, timeSeries);
    }
}