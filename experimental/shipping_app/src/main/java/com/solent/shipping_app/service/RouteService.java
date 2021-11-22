package com.solent.shipping_app.service;

import com.solent.shipping_app.data.models.Booking;
import com.solent.shipping_app.data.models.Route;
import com.solent.shipping_app.data.payloads.request.BookingRequest;
import com.solent.shipping_app.data.payloads.request.RouteRequest;
import com.solent.shipping_app.data.payloads.response.MessageResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface RouteService {
    MessageResponse createRoute(RouteRequest routeRequest);
    Optional<Route> updateRoute(Integer routeID, RouteRequest routeRequest);
    void deleteRoute(Integer routeId);
    Route getASingleRoute(Integer routeID);
    List<Route> getAllRoute();
}
