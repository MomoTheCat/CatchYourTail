package pl.lodz.zagadnienia.Ryanair.controller;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.lodz.zagadnienia.Ryanair.model.Airports;
import pl.lodz.zagadnienia.Ryanair.model.FlightBookingSelector;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * Created by szymo on 10/03/2016.
 */
@RestController
@RequestMapping("/ryanair")
public class Controller {

    private static final String URL_FLIGHTS_BOOKING = "https://www.ryanair.com/en/api/2/forms/flight-booking-selector/";
    private static final String AIRPORTS = "https://www.ryanair.com/en/api/2/airports/";
    private static final String ROUTES = "https://www.ryanair.com/en/api/2/routes/";

    @RequestMapping(method = RequestMethod.GET)
    public Airports get() {

        //GSON
        Gson gson = new Gson();
        String json = null;

        try {
             json = readUrl(AIRPORTS);
        } catch (Exception e) {
            e.printStackTrace();
        }

        List<Airports> airports = gson.fromJson(json, new TypeToken<List<Airports>>(){}.getType());
        airports.forEach(x -> System.out.println(x.getName())); //TODO just for tests

            return airports.get(0) != null ? airports.get(0) : null;
    }

    @RequestMapping(path = "/lodz", method = RequestMethod.GET)
    public String test() {
        return "Czarna dziura to Baluty";
    }

    private static String readUrl(String urlString) throws Exception {
        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuffer buffer = new StringBuffer();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1)
                buffer.append(chars, 0, read);

            return buffer.toString();
        } finally {
            if (reader != null)
                reader.close();
        }
    }

}