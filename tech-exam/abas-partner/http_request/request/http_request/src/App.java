import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        try{
            Scanner scanner = new Scanner(System.in);
            String city;
            do{
                // Retrieve user input
                System.out.println();
                System.out.print("Enter City (Say No to Quit): ");
                city = scanner.nextLine();

                if(city.equalsIgnoreCase("No")) break;

                
                JSONObject cityLocationData = (JSONObject)getLocationData(city);
                double latitude = (double) cityLocationData.get("latitude");
                double longitude = (double) cityLocationData.get("longitude");

                displayWeatherData(latitude, longitude);
            }while(!city.equalsIgnoreCase("No"));

        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private static JSONObject getLocationData(String city){
        city = city.replaceAll(" ", "+");

        String urlString = "https://geocoding-api.open-meteo.com/v1/search?name=" +
                city + "&count=1&language=en&format=json";

        try{
            //POST isteği objesinin oluşturulması
            HttpURLConnection apiConnection = fetchApiResponse(urlString);

            // check for response status
            // HTTP Durum kodlarından 200 başarılı anlamına gelmektedir.
            //201: POST veya PUT yöntemi başarılıdır.
            //204: PUT veya POST isteği başarılı. Dizin veya belgeler başarıyla karşıya yüklendi.
            //1xx Bilgi durum kodları
            //2xx başarılı durum kodları
            //3xx yönlendirme durum kodları
            //4xx client hata durum kodları
            //5xx server hata durum kodları

            if(apiConnection.getResponseCode() != 200){
                System.out.println("Error: Could not connect to API");
                return null;
            }

            
            String jsonResponse = readResponse(apiConnection);

            // Stringi JSON formatına dönüştürme işlemi
            JSONParser parser = new JSONParser();
            JSONObject resultsJsonObj = (JSONObject) parser.parse(jsonResponse);

            // Son olarak da konum bilgisi için elde edilen response
            JSONArray locationData = (JSONArray) resultsJsonObj.get("results");
            return (JSONObject) locationData.get(0);

        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    private static void displayWeatherData(double latitude, double longitude){
        try{
            //Api parametrelerinin string değişkenine entegre edilmesi
            String url = "https://api.open-meteo.com/v1/forecast?latitude=" + latitude +
                    "&longitude=" + longitude + "&current=temperature_2m,relative_humidity_2m,wind_speed_10m";
            HttpURLConnection apiConnection = fetchApiResponse(url);

            
           
            if(apiConnection.getResponseCode() != 200){
                System.out.println("HATA: Api bağlanılamadı !");
                return;
            }

            
            String jsonResponse = readResponse(apiConnection);

            
            JSONParser parser = new JSONParser();
            JSONObject jsonObject = (JSONObject) parser.parse(jsonResponse);
            JSONObject currentWeatherJson = (JSONObject) jsonObject.get("current");
            System.out.println(currentWeatherJson.toJSONString());
            System.out.println();
           
            String time = (String) currentWeatherJson.get("time");
            System.out.println("Current Time: " + time);

            double temperature = (double) currentWeatherJson.get("temperature_2m");
            System.out.println("Current Temperature (C): " + temperature);

            long relativeHumidity = (long) currentWeatherJson.get("relative_humidity_2m");
            System.out.println("Relative Humidity: " + relativeHumidity);

            double windSpeed = (double) currentWeatherJson.get("wind_speed_10m");
            System.out.println("Wind Speed: " + windSpeed);
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    private static String readResponse(HttpURLConnection apiConnection) {
        try {
            // Json formatında için stringbuilder oluşturulur.
            StringBuilder resultJson = new StringBuilder();

            
            Scanner scanner = new Scanner(apiConnection.getInputStream());

            
            while (scanner.hasNext()) {
                
                resultJson.append(scanner.nextLine());
            }

            
            scanner.close();

           
            return resultJson.toString();

        } catch (IOException e) {
            // Hata çıktısı
            e.printStackTrace();
        }

        // null döndüğünde bir sorun var anlamına geliyor.
        return null;
    }

    private static HttpURLConnection fetchApiResponse(String urlString){
        try{
            // get isteği için bağlantı objesi oluşturulması.
            URL url = new URL(urlString);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();

            // GET isteği
            conn.setRequestMethod("GET");

            return conn;
        }catch(IOException e){
            e.printStackTrace();
        }

        
        return null;
    }
        





    }

