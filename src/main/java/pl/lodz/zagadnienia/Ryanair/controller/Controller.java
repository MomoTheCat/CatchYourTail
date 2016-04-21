package pl.lodz.zagadnienia.Ryanair.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pl.lodz.zagadnienia.Ryanair.model.FlightBookingSelector;


/**
 * Created by szymo on 10/03/2016.
 */
@RestController
@RequestMapping("/ryanair")
public class Controller {

    private static final String URL_FLIGHTS_BOOKING = "https://www.ryanair.com/en/api/2/forms/flight-booking-selector/";

    @RequestMapping(method = RequestMethod.GET)
    public FlightBookingSelector get() {

        ObjectMapper mapper = new ObjectMapper();
        FlightBookingSelector graph = null;
//        try {
//            graph = mapper.readValue(URL_FLIGHTS_BOOKING, FlightBookingSelector.class);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        return graph;

    }

    @RequestMapping(path = "/lodz", method = RequestMethod.GET)
    public String test() {
        return "Czarna dziura to Baluty";
    }

}