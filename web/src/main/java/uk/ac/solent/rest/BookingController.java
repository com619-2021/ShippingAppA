package uk.ac.solent.rest;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import uk.ac.solent.dao.booking.BookingRepository;
import uk.ac.solent.model.booking.BookingDto;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping(path ="/api/booking", produces = "application/json")
@Transactional
public class BookingController implements BaseController<BookingDto>{

    private final BookingRepository bookingRepository;

    public BookingController(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    @PostMapping("/api/booking")
    public BookingDto create(BookingDto entity) {
        return null;
    }

    @Override
    @PatchMapping( "/api/booking/{id}")
    public BookingDto save(@PathVariable( "id" ) Integer id, BookingDto entity) {
        return null;
    }

    @Override
    @GetMapping("/api/booking/{id}")
    public BookingDto findById(@PathVariable( "id" ) Integer id) {
        return null;
    }

    @Override
    @GetMapping("/api/booking")
    public List<BookingDto> findAll() {
        return Collections.emptyList();
    }

    @Override
    @DeleteMapping("/api/booking/{id}")
    public BookingDto deleteById(@PathVariable( "id" ) Integer id) {
        return null;
    }

    @Override
    @PutMapping("/api/booking/{id}")
    public BookingDto archiveById(@PathVariable( "id" ) Integer id) {
        return null;
    }
}
