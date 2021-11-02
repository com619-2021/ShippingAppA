package com.solent.shipping_app.data.repository;
import com.solent.shipping_app.data.models.Ship;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
    public interface ShipRepo extends JpaRepository<Ship, Integer> {

}
