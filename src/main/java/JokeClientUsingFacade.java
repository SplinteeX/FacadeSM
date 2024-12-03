import java.io.IOException;

public class JokeClientUsingFacade {
    public static void main(String[] args) {
        ApiFacade apiFacade = new ApiFacade();

        try {
            // Retrieve a random Chuck Norris joke
            String jokeUrl = "https://api.chucknorris.io/jokes/random";
            String joke = apiFacade.getAttributeValueFromJson(jokeUrl, "value");
            System.out.println("Random Chuck Norris Joke: " + joke);

            // Example: Retrieve data from another API (exchange rates)
            String exchangeRatesUrl = "https://api.exchangerate-api.com/v4/latest/USD";
            String baseCurrency = apiFacade.getAttributeValueFromJson(exchangeRatesUrl, "base");
            System.out.println("Base currency for exchange rates: " + baseCurrency);

        } catch (IllegalArgumentException | IOException e) {
            e.printStackTrace();
        }
    }
}