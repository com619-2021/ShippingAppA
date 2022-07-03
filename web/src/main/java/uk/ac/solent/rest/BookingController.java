package uk.ac.solent.rest;

import com.sun.tools.sjavac.Log;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import uk.ac.solent.dao.booking.BookingRepository;
import uk.ac.solent.model.booking.BookingDto;

import javax.validation.Valid;
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
    @PostMapping("/api/booking")
    public void add(@Valid @RequestBody BookingDto entity) {
        bookings.add(entity);
    }

    @Override
    @PatchMapping(value = "/api/booking/{id}")
    public BookingDto save(@PathVariable( "id" ) Integer id, BookingDto entity) {
        return null;
    }

    @Override
    @GetMapping(value ="/api/booking/{id}", produces = {org.springframework.http.MediaType.APPLICATION_JSON_VALUE})
    public BookingDto findById(@RequestParam Integer id) {
        return bookings.stream().filter(booking -> booking.getId() == id).findFirst().orElse(null);
    }

    @Override
    @GetMapping(value ="/api/booking", produces = {org.springframework.http.MediaType.APPLICATION_JSON_VALUE})
    public List<BookingDto> findAll() {
        return bookings;
    }

    @Override
    @RequestMapping(value = "/api/booking/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteById(@PathVariable( "id" ) Integer id) {
        Log.warn("HELOOO");
        Log.debug(bookings.get(0).getId().toString());
        bookings.stream().filter(booking -> booking.getId().toString() == String.valueOf(id)).findFirst().ifPresent(bookings::remove);
    }

    @Override
    @PutMapping(value ="/api/booking/{id}")
    public BookingDto archiveById(@PathVariable( "id" ) Integer id) {
        return null;
    }
}
