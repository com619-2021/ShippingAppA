package com.solent.shipping_app.data.payloads.request;


import com.solent.shipping_app.data.models.Inventory;
import com.solent.shipping_app.data.models.Service;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.List;

public class BookingRequest {




    @NotBlank
    @NotNull
    private Date startDate;
    @NotBlank
    @NotNull
    private Date endDate;
    @NotBlank
    @NotNull
    private List<Service> services;

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
}
