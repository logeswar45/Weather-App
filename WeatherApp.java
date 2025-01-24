import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.CloseableHttpResponse;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

public class WeatherApp {

    private static final String API_URL = "http://api.openweathermap.org/data/2.5/weather?q=London&appid=YOUR_API_KEY&units=metric";

    public static void main(String[] args) {
        try {
            CloseableHttpClient httpClient = HttpClients.createDefault();
            HttpGet request = new HttpGet(API_URL);
            CloseableHttpResponse response = httpClient.execute(request);
            HttpEntity entity = response.getEntity();
            String responseString = EntityUtils.toString(entity);
            JsonObject jsonResponse = JsonParser.parseString(responseString).getAsJsonObject();
            double temperature = jsonResponse.getAsJsonObject("main").get("temp").getAsDouble();
            int humidity = jsonResponse.getAsJsonObject("main").get("humidity").getAsInt();
            int pressure = jsonResponse.getAsJsonObject("main").get("pressure").getAsInt();
            String weatherDescription = jsonResponse.getAsJsonArray("weather").get(0).getAsJsonObject().get("description").getAsString();
            double windSpeed = jsonResponse.getAsJsonObject("wind").get("speed").getAsDouble();
            System.out.println("Weather Information for London:");
            System.out.println("--------------------------------");
            System.out.println("Temperature: " + temperature + "°C");
            System.out.println("Humidity: " + humidity + "%");
            System.out.println("Pressure: " + pressure + " hPa");
            System.out.println("Weather: " + weatherDescription);
            System.out.println("Wind Speed: " + windSpeed + " m/s");
            response.close();
            httpClient.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}