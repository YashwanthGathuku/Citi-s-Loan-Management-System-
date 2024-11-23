package citi;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Queue;
import java.util.LinkedList;
import java.math.BigDecimal;
import java.io.IOException;
import java.util.Date;

public class App {

    // Queue to store stock values and timestamps
    private static Queue<StockData> stockQueue = new LinkedList<>();

    public static void main(String[] args) {
        // Symbol for Dow Jones Industrial Average
        String symbol = "^DJI";

        // Timer to schedule the task every 5 seconds
        Timer timer = new Timer();

        // TimerTask to fetch stock data
        TimerTask fetchStockTask = new TimerTask() {
            @Override
            public void run() {
                try {
                    // Fetch the stock data
                    Stock stock = YahooFinance.get(symbol);
                    BigDecimal price = stock.getQuote().getPrice();
                    Date timestamp = new Date();

                    // Store data in the queue
                    stockQueue.add(new StockData(price, timestamp));

                    // Optional: Print the stock data
                    System.out.println("Price: " + price + " Time: " + timestamp);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        };

        // Schedule the task to run every 5 seconds
        timer.scheduleAtFixedRate(fetchStockTask, 0, 5000);
    }

    // Inner class to store stock data
    static class StockData {
        private BigDecimal price;
        private Date timestamp;

        public StockData(BigDecimal price, Date timestamp) {
            this.price = price;
            this.timestamp = timestamp;
        }

        public BigDecimal getPrice() {
            return price;
        }

        public Date getTimestamp() {
            return timestamp;
        }
    }
}
