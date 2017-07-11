package hello;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class WeatherController {

    @RequestMapping(value = "/forecast", produces = "application/json")
    public List<Time> index() throws Exception {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_XML));
        HttpEntity<String> entity = new HttpEntity<String>(headers);
        WeatherData wd = new WeatherData();
        WeatherData response;
        // http://api.met.no/weatherapi/probabilityforecast/1.1/?lat=60.10;lon=9.58;msl=70
        // locationforecast/1.9/
        response = restTemplate.getForObject(
                "http://api.met.no/weatherapi/locationforecast/1.9/?lat={lat}&lon={lon}&msl={msl}",
                WeatherData.class,
                "60.10",
                "9.58",
                "70");

        Time xtime[] = response.product.xtime;

        List<Time> hours = new ArrayList<Time>();
        boolean needPrecipitationData = false;
        Time currentHour = null;
        for (Time t : xtime) {
            if (t.location.temperature != null) {
                currentHour = t;
                needPrecipitationData = true;
            }
            else if (needPrecipitationData) {
                // Add first entry of rain info
                if (currentHour != null) {
                    currentHour.location.precipitation = t.location.precipitation;
                    currentHour.location.symbol = t.location.symbol;
                }

                hours.add(currentHour);
                needPrecipitationData = false;

                System.out.println(currentHour);
            }
        }

        return hours; //"Greetings from Spring Boot Weather Controller " +
    }

}


