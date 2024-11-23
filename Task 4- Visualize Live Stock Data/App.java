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

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.application.Platform;

public class App extends Application {

    // Queue to store stock values and timestamps
    private static Queue<StockData> stockQueue = new LinkedList<>();

    // Line chart series to update the graph
    private XYChart.Series<Number, Number> series = new XYChart.Series<>();

    // Variable to keep track of time ticks
    private int timeTick = 0;

    @Override
    public void start(Stage stage) {
        stage.setTitle("Dow Jones Industrial Average Live Stock Price");

        // Defining the axes
        final NumberAxis xAxis = new NumberAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Time Ticks");
        yAxis.setLabel("Stock Price (USD)");

        // Creating the line chart
        final LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Live Stock Price of Dow Jones Industrial Average");

        // Adding the series to the chart
        series.setName("DJIA");
        lineChart.getData().add(series);

        // Setting up the scene
        Scene scene = new Scene(lineChart, 800, 600);
        stage.setScene(scene);
        stage.show();

        // Start fetching stock data
        fetchStockData();
    }

    public void fetchStockData() {
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

                    // Update the chart on the JavaFX Application Thread
                    Platform.runLater(() -> {
                        // Add data point to the series
                        series.getData().add(new XYChart.Data<>(timeTick++, price.doubleValue()));
                    });

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

    public static void main(String[] args) {
        launch(args);
    }
}
