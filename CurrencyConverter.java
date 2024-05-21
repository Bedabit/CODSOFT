package inte;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CurrencyConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define exchange rates (base currency is USD)
        Map<String, Double> exchangeRates = new HashMap<>();
        exchangeRates.put("USD", 1.0);  // USD to USD (base currency)
        exchangeRates.put("EUR", 0.82); // USD to EUR
        exchangeRates.put("GBP", 0.71); // USD to GBP
        exchangeRates.put("INR", 73.10); // USD to INR
        // Add more exchange rates as needed

        // Prompt the user to select base and target currencies
        System.out.print("Enter the base currency code (e.g., USD, EUR, GBP, INR): ");
        String baseCurrency = scanner.nextLine().toUpperCase();

        System.out.print("Enter the target currency code (e.g., USD, EUR, GBP, INR): ");
        String targetCurrency = scanner.nextLine().toUpperCase();

        // Prompt the user to input the amount to convert
        System.out.print("Enter the amount to convert: ");
        double amount = scanner.nextDouble();

        // Get the exchange rate for the target currency
        double exchangeRate = exchangeRates.get(targetCurrency);

        // Convert amount to target currency
        double convertedAmount = amount * exchangeRate;

        // Display the result
        System.out.println(amount + " " + baseCurrency + " is equal to " + convertedAmount + " " + targetCurrency);

        scanner.close();
    }
}