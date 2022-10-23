//Write a program to read in Stock Names, Number of Share, Share Price.
// list of Stocks read from the input file.
// Print a Stock Report with the total value of Stock.

package StockAccountManagement;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.List;

public class StockAccountManagement {

    public List<StockDetails> getStockDetailsFromFile() throws FileNotFoundException {
        Gson gson = new Gson(); //created gson library

        //read json file from file path
        JsonReader reader = new JsonReader(new FileReader("D:/JAVA Class/Day11_12/src/StockAccountManagement/stock.json"));
        StockDetails[] stockDetails = gson.fromJson(reader, StockDetails[].class); // read data from file path store the data in array
        return Arrays.asList(stockDetails);
    }

    public void printStockReport(List<StockDetails> stockDetailsList) {
        for (StockDetails stockDetails1 : stockDetailsList) {
            System.out.println("stock name: " + stockDetails1.getStockName());
            System.out.println("Number of stock: " + stockDetails1.getNumOfShare());
            System.out.println("stock price: " + stockDetails1.getSharePrice());
            System.out.println("Total Price of Stocks: " + stockDetails1.getSharePrice() * stockDetails1.getNumOfShare());
            System.out.println("-------------------------------");
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        StockAccountManagement stockAccountManagement = new StockAccountManagement();
        stockAccountManagement.printStockReport(stockAccountManagement.getStockDetailsFromFile());
    }
}


