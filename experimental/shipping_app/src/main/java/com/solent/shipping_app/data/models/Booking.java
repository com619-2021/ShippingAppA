package com.solent.shipping_app.data.models;


import javax.persistence.*;
import java.util.Date;
import java.util.List;
import java.util.Objects;



@Entity
public class Booking {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Date startDate;
    private Date endDate;
    @ElementCollection
    private List<Service> services;

    public Booking() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) { this.startDate = startDate; }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }



    @Override
    public String toString() {
        return "Booking{" +
                "id=" + id +
                ", startDate='" + startDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", services='" + services + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Booking booking = (Booking) o;
        return Objects.equals(id, booking.id)
                && Objects.equals(startDate, booking.startDate)
                && Objects.equals(endDate, booking.endDate)
                && Objects.equals(services, booking.services);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id, startDate, endDate, services
        );
    }
}
