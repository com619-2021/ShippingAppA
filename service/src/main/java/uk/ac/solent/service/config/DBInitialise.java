package uk.ac.solent.service.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import uk.ac.solent.dao.booking.BookingRepository;
import uk.ac.solent.dao.route.RouteRepository;
import uk.ac.solent.dao.ship.ShipRepository;
import uk.ac.solent.dao.user.UserRepository;

@Component
public class DBInitialise {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private ShipRepository shipRepository;

    @Autowired
    private RouteRepository routeRepository;

    @PostConstruct
    public void init() {


    }
}