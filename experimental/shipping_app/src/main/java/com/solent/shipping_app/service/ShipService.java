package com.solent.shipping_app.service;

import com.solent.shipping_app.data.models.Ship;
import com.solent.shipping_app.data.payloads.request.ShipRequest;
import com.solent.shipping_app.data.payloads.response.MessageResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface ShipService {
    MessageResponse createShip(ShipRequest shipRequest);
    Optional<Ship> updateShip(Integer shipId, ShipRequest shipRequest);
    void deleteShip(Integer shipId);
    Ship getASingleShip(Integer shipId);
    List<Ship> getAllShip();
}
