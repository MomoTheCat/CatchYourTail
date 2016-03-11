package pl.lodz.zagadnienia.Ryanair.model;


import java.util.List;

/**
 * Created by szymo on 11/03/2016.
 */
public class FlightBookingSelector {
    private String closures;
    private String routes;
    private List<Airports> airports;
    private String discounts;
    private List<Country> countries;
    private String messages;

    public FlightBookingSelector(String closures, String routes, List<Airports> airports, String discounts,
                                 List<Country> countries, String messages) {
        this.closures = closures;
        this.routes = routes;
        this.airports = airports;
        this.discounts = discounts;
        this.countries = countries;
        this.messages = messages;
    }

    public String getClosures() {
        return closures;
    }

    public void setClosures(String closures) {
        this.closures = closures;
    }

    public String getRoutes() {
        return routes;
    }

    public void setRoutes(String routes) {
        this.routes = routes;
    }

    public List<Airports> getAirports() {
        return airports;
    }

    public void setAirports(List<Airports> airports) {
        this.airports = airports;
    }

    public String getDiscounts() {
        return discounts;
    }

    public void setDiscounts(String discounts) {
        this.discounts = discounts;
    }

    public List<Country> getCountries() {
        return countries;
    }

    public void setCountries(List<Country> countries) {
        this.countries = countries;
    }

    public String getMessages() {
        return messages;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }
}
