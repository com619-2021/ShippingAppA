package com.solent.shipping_app.data.models;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;

//{
//        inventory: [
//        {quantity: 3, name: 'wood', unit: 'metric tons'}
//        ],
//        }

@Entity
public class Ship {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String shipName;
    private Integer passengers;
    private Integer depth;
    private Integer size;
    private Date arrival;
    @ElementCollection
    private List<Service> services;
    @ElementCollection
    private List<Inventory> inventory;


    public Ship() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getShipName() {
        return shipName;
    }

    public void setShipName(String shipName) {
        this.shipName = shipName;
    }

    public Integer getPassengers() {
        return passengers;
    }

    public void setPassengers(Integer passengers) {
        this.passengers = passengers;
    }

    public Integer getDepth() {
        return depth;
    }

    public void setDepth(Integer depth) {
        this.depth = depth;
    }

    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    public Date getArrival() {
        return arrival;
    }

    public void setArrival(Date arrival) {
        this.arrival = arrival;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public List<Inventory> getInventory() {
        return inventory;
    }

    public void setInventory(List<Inventory> inventory) {
        this.inventory = inventory;
    }


    @Override
    public String toString() {
        return "Ship{" +
                "id=" + id +
                ", shipName='" + shipName + '\'' +
                ", passengers='" + passengers + '\'' +
                ", depth='" + depth + '\'' +
                ", size='" + size + '\'' +
                ", arrival=" + arrival +
                ", services=" + services +
                ", inventory=" + inventory +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ship ship = (Ship) o;
        return Objects.equals(id, ship.id)
                && Objects.equals(shipName, ship.shipName)
                && Objects.equals(passengers, ship.passengers)
                && Objects.equals(depth, ship.depth)
                && Objects.equals(size, ship.size);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id, shipName, passengers, depth, size, arrival
                //, services, inventory
        );
    }
}
