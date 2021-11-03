package com.solent.shipping_app.web;

import com.solent.shipping_app.data.models.Ship;
import com.solent.shipping_app.data.payloads.request.ShipRequest;
import com.solent.shipping_app.data.payloads.response.MessageResponse;
import com.solent.shipping_app.service.ShipService;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/ship")
//Line 19 to 24 is the newly added code for swagger documentation
@ApiResponses(value = {
        @io.swagger.annotations.ApiResponse(code = 400, message = "This is a bad request, please follow the API documentation for the proper request format"),
        @io.swagger.annotations.ApiResponse(code = 401, message = "Due to security constraints, your access request cannot be authorized"),
        @io.swagger.annotations.ApiResponse(code = 500, message = "The server is down. Please bear with us."),
}
)
public class ShipController {

    @Autowired
    ShipService shipService;

    @GetMapping("/all")
    public ResponseEntity<List<Ship>> getAllShip() {
        List<Ship> footballers = shipService.getAllShip();
        return new ResponseEntity<>(footballers, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Ship> getShipById(@PathVariable("id") Integer id) {
        Ship ship = shipService.getASingleShip(id);
        return new ResponseEntity<>(ship, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<MessageResponse> addShip(@RequestBody ShipRequest ship) {
        MessageResponse newShip = shipService.createShip(ship);
        return new ResponseEntity<>(newShip, HttpStatus.CREATED);
    }

    @PutMapping("/update/{id}")
    public Optional<Ship> updateShip(@PathVariable Integer id, @RequestBody ShipRequest ship) {
        return shipService.updateShip(id, ship);

    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteShip(@PathVariable("id") Integer id) {
        shipService.deleteShip(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

}