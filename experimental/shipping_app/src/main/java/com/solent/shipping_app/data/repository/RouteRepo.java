package com.solent.shipping_app.data.repository;
import com.solent.shipping_app.data.models.Booking;
import com.solent.shipping_app.data.models.Route;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RouteRepo extends JpaRepository<Route, Integer> {

}
