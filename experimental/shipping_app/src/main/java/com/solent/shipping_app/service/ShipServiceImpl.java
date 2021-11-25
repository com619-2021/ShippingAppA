package com.solent.shipping_app.service;

//import com.solent.shipping_app.data.models.Inventory;
import com.solent.shipping_app.data.models.Ship;
import com.solent.shipping_app.data.payloads.request.ShipRequest;
import com.solent.shipping_app.data.payloads.response.MessageResponse;
import com.solent.shipping_app.data.repository.ShipRepo;
import com.solent.shipping_app.exception.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ShipServiceImpl implements ShipService {
    @Autowired
    ShipRepo shipRepo;


    @Override
    public MessageResponse createShip(ShipRequest shipRequest) {
        Ship newShip = new Ship();
        newShip.setShipName(shipRequest.getShipName());
        newShip.setPassengers(shipRequest.getPassengers());
        newShip.setDepth(shipRequest.getDepth());
        newShip.setSize(shipRequest.getSize());
        newShip.setArrival(shipRequest.getArrival());
        newShip.setServices(shipRequest.getServices());
        newShip.setInventory(shipRequest.getInventory());
        shipRepo.save(newShip);
        return new MessageResponse("New Ship created successfully");

    }


    @Override
    public Optional<Ship> updateShip(Integer shipID, ShipRequest shipRequest) throws ResourceNotFoundException {
        Optional<Ship> ship = shipRepo.findById(shipID);
        if (ship.isEmpty()) {
            throw new ResourceNotFoundException("Ship", "id", shipID);
        } else
            ship.get().setShipName(shipRequest.getShipName());
        ship.get().setPassengers(shipRequest.getPassengers());
        ship.get().setDepth(shipRequest.getDepth());
        ship.get().setSize(shipRequest.getSize());
        ship.get().setArrival(shipRequest.getArrival());
        ship.get().setServices(shipRequest.getServices());
        ship.get().setInventory(shipRequest.getInventory());
        shipRepo.save(ship.get());
        return ship;
    }

    @Override
    public Ship getASingleShip(Integer shipId) throws ResourceNotFoundException {
        return shipRepo.findById(shipId).orElseThrow(() -> new ResourceNotFoundException("Ship", "id", shipId));
    }

    @Override
    public List<Ship> getAllShip() {
        return shipRepo.findAll();
    }

    @Override
    public void deleteShip(Integer shipId) throws ResourceNotFoundException {
        if (shipRepo.getById(shipId).getId().equals(shipId)) {
            shipRepo.deleteById(shipId);
        } else throw new ResourceNotFoundException("Ship", "id", shipId);
    }

}

