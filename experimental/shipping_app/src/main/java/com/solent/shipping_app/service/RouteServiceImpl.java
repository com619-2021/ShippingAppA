package com.solent.shipping_app.service;

import com.solent.shipping_app.data.models.Booking;
import com.solent.shipping_app.data.models.Route;
import com.solent.shipping_app.data.payloads.request.BookingRequest;
import com.solent.shipping_app.data.payloads.request.RouteRequest;
import com.solent.shipping_app.data.payloads.response.MessageResponse;
import com.solent.shipping_app.data.repository.BookingRepo;
import com.solent.shipping_app.data.repository.RouteRepo;
import com.solent.shipping_app.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RouteServiceImpl implements RouteService {
    @Autowired
    RouteRepo routeRepo;


    @Override
    public MessageResponse createRoute(RouteRequest routeRequest) {
        Route newRoute = new Route();
        newRoute.setShip(routeRequest.getShip());
        newRoute.setArrival(routeRequest.getArrival());
        newRoute.setDeparture(routeRequest.getDeparture());
        newRoute.setOrigin(routeRequest.getOrigin());
        newRoute.setDestination(routeRequest.getDestination());
        routeRepo.save(newRoute);
        return new MessageResponse("New Route created successfully");

    }


    @Override
    public Optional<Route> updateRoute(Integer routeID, RouteRequest routeRequest) throws ResourceNotFoundException {
        Optional<Route> route = routeRepo.findById(routeID);
        if (route.isEmpty()) {
            throw new ResourceNotFoundException("Route", "id", routeID);
        } else
            route.get().setShip(routeRequest.getShip());
        route.get().setArrival(routeRequest.getArrival());
        route.get().setDeparture(routeRequest.getDeparture());
        route.get().setOrigin(routeRequest.getOrigin());
        route.get().setDestination(routeRequest.getDestination());
        routeRepo.save(route.get());
        return route;
    }

    @Override
    public Route getASingleRoute(Integer routeID) throws ResourceNotFoundException {
        return routeRepo.findById(routeID).orElseThrow(() -> new ResourceNotFoundException("Route", "id", routeID));
    }

    @Override
    public List<Route> getAllRoute() {
        return routeRepo.findAll();
    }

    @Override
    public void deleteRoute(Integer routeID) throws ResourceNotFoundException {
        if (routeRepo.getById(routeID).getId().equals(routeID)) {
            routeRepo.deleteById(routeID);
        } else throw new ResourceNotFoundException("Route", "id", routeID);
    }

}

