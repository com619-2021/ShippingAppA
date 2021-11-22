package com.solent.shipping_app.web;

import com.solent.shipping_app.data.models.Booking;
import com.solent.shipping_app.data.models.Route;
import com.solent.shipping_app.data.payloads.request.BookingRequest;
import com.solent.shipping_app.data.payloads.request.RouteRequest;
import com.solent.shipping_app.data.payloads.response.MessageResponse;
import com.solent.shipping_app.service.RouteService;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/route")
//Line 19 to 24 is the newly added code for swagger documentation
@ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 400, message = "This is a bad request, please follow the API documentation for the proper request format"),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Due to security constraints, your access request cannot be authorized"),
        @io.swagger.annotations.ApiResponse(code = 500, message = "The server is down. Please bear with us."),
}
)
public class RouteController {

    @Autowired
    RouteService routeService;

    @GetMapping("/all")
    public ResponseEntity<List<Route>> getAllRoute() {
        List<Route> footballers = routeService.getAllRoute();
        return new ResponseEntity<>(footballers, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Route> getRouteByID(@PathVariable("id") Integer id) {
        Route route = routeService.getASingleRoute(id);
        return new ResponseEntity<>(route, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<MessageResponse> addRoute(@RequestBody RouteRequest route) {
        MessageResponse newRoute = routeService.createRoute(route);
        return new ResponseEntity<>(newRoute, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public Optional<Route> updateRoute(@PathVariable Integer id, @RequestBody RouteRequest route) {
        return routeService.updateRoute(id, route);

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteRoute(@PathVariable("id") Integer id) {
        routeService.deleteRoute(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}