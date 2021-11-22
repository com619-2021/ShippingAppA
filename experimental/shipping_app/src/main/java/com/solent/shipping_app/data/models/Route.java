package com.solent.shipping_app.data.models;


import javax.persistence.*;
import java.util.Date;
import java.util.Objects;



@Entity
public class Route {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer ship;
    private Date arrival;
    private Date departure;
    private String origin;
    private String destination;

    public Route() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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



    @Override
    public String toString() {
        return "Route{" +
                "id=" + id +
                ", ship='" + ship + '\'' +
                ", arrival='" + arrival + '\'' +
                ", departure='" + departure + '\'' +
                ", origin='" + origin + '\'' +
                ", origin='" + destination + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Route route = (Route) o;
        return Objects.equals(id, route.id)
                && Objects.equals(ship, route.ship)
                && Objects.equals(arrival, route.arrival)
                && Objects.equals(departure, route.departure)
                && Objects.equals(origin, route.origin)
                && Objects.equals(destination, route.destination);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id, ship, arrival, departure, origin, destination
        );
    }
}
