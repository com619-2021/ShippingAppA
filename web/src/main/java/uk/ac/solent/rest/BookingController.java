package uk.ac.solent.rest;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import uk.ac.solent.dao.booking.BookingRepository;
import uk.ac.solent.model.booking.BookingDto;
import uk.ac.solent.model.route.RouteDto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping(path ="/api/booking", produces = "application/json")
@Transactional
public class BookingController implements BaseController<BookingDto>{

    private final BookingRepository bookingRepository;
    private static final List<BookingDto> bookings = new ArrayList<>();
    public BookingController(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    @PostMapping(value ="/api/booking")
    public void add(BookingDto entity) {
        bookings.add(entity);
    }

    @Override
    @PatchMapping(value = "/api/booking/{id}")
    public BookingDto save(@PathVariable( "id" ) Integer id, BookingDto entity) {
        return null;
    }

    @Override
    @GetMapping(value ="/api/booking/{id}")
    public BookingDto findById(@PathVariable( "id" ) Integer id) {
        return null;
    }

    @Override
    @GetMapping(value ="/api/booking")
    public List<BookingDto> findAll() {
        return Collections.emptyList();
    }

    @Override
    @DeleteMapping(value ="/api/booking/{id}")
    public void deleteById(@PathVariable( "id" ) Integer id) {
    }

    @Override
    @PutMapping(value ="/api/booking/{id}")
    public BookingDto archiveById(@PathVariable( "id" ) Integer id) {
        return null;
    }
}
