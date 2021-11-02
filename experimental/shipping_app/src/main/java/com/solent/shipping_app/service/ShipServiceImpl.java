package com.solent.shipping_app.service;

import com.solent.shipping_app.data.models.Ship;
import com.solent.shipping_app.data.payloads.request.ShipRequest;
import com.solent.shipping_app.data.payloads.response.MessageResponse;
import com.solent.shipping_app.data.repository.ShipRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ShipServiceImpl implements ShipService {
    @Autowired
    ShipRepo shipRepo;

    @Override
    public MessageResponse createShip(ShipRequest shipRequest) {
        Ship newShip = new Ship();
        newShip.setFirstName(ShipRequest.getFirstName());
        newShip.setLastname(ShipRequest.getLastname());
        newShip.setPhoneNumber(ShipRequest.getPhoneNumber());
        newShip.setEmail(ShipRequest.getEmail());
        newShip.setSalary(ShipRequest.getSalary());
        newShip.setRoute(ShipRequest.getRoutes());
        shipRepo.save(newShip);
        return new MessageResponse("New Employee created successfully");

    }


    @Override
    public Optional<Ship> updateShip(Integer shipID, ShipRequest shipRequest)  throws ResourceNotFoundException{
        Optional<Ship> ship = shipRepo.findById(shipID);
        if (ship.isEmpty()){
            throw new ResourceNotFoundException("Ship", "id", shipID);
        }
        else
            ship.get().setFirstName(shipRequest.getFirstName());
        ship.get().setLastname(shipRequest.getLastname());
        ship.get().setPhoneNumber(shipRequest.getPhoneNumber());
        ship.get().setEmail(shipRequest.getEmail());
        ship.get().setSalary(shipRequest.getSalary());
        ship.get().setRoute(shipRequest.getRoutes());
        shipRepo.save(ship.get());
        return ship;
    }

    @Override
    public Ship getASingleShip(Integer shipId) throws ResourceNotFoundException{
        return shipRepo.findById(shipId).orElseThrow(() -> new ResourceNotFoundException("Ship", "id", shipId));
    }

    @Override
    public List<Ship> getAllShip() {
        return shipRepo.findAll();
    }
    @Override
    public void deleteShip(Integer shipId) throws ResourceNotFoundException {
        if (shipRepo.getById(shipId).getId().equals(shipId)){
            shipRepo.deleteById(shipId);
        }
        else throw new ResourceNotFoundException("Employee", "id", shipId);
    }

}

