package com.solent.shipping_app.data.payloads.request;


//import com.solent.shipping_app.data.models.Service;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

public class RouteRequest {






    private String destination;
    @NotBlank
    @NotNull
    private Integer ship;
    @NotBlank
    @NotNull
    private Date arrival;
    @NotBlank
    @NotNull
    private Date departure;
    @NotBlank
    @NotNull
    private String origin;

    public Integer getShip() {
        return ship;
    }

    public void setShip(Integer ship) {
        this.ship = ship;
    }

    public Date getArrival() {
        return arrival;
    }

    public void setArrival(Date arrival) {
        this.arrival = arrival;
    }

    public Date getDeparture() {
        return departure;
    }

    public void setDeparture(Date departure) {
        this.departure = departure;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }
}
