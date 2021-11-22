package com.solent.shipping_app.data.payloads.request;


import com.solent.shipping_app.data.models.Inventory;
import com.solent.shipping_app.data.models.Routes;
import com.solent.shipping_app.data.models.Service;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

public class ShipRequest {
    @NotBlank
    @NotNull
    private String shipName;
    @NotBlank
    @NotNull
    private Integer passengers;
    @NotBlank
    @NotNull
    private Integer depth;
    @NotBlank
    @NotNull
    private Integer size;
    @NotBlank
    @NotNull
    private Date arrival;
    @NotBlank
    @NotNull
    private List<Service> services;
    @NotBlank
    @NotNull
    private List<Inventory> inventory;

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
}
