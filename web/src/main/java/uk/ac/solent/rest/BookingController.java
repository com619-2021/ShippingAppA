package uk.ac.solent.rest;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import uk.ac.solent.dao.booking.BookingRepository;
import uk.ac.solent.model.booking.BookingDto;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value ="/booking", produces = "application/json")
@Transactional
public class BookingController implements BaseController<BookingDto>{

    private final BookingRepository bookingRepository;

    public BookingController(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    @PostMapping("")
    public Optional<BookingDto> create(BookingDto entity) {
        return Optional.empty();
    }

    @Override
    @PatchMapping( "/{id}")
    public Optional<BookingDto> save(@PathVariable( "id" ) Integer id, BookingDto entity) {
        return Optional.empty();
    }

    @Override
    @GetMapping("/{id}")
    public Optional<BookingDto> findById(@PathVariable( "id" ) Integer id) {
        return Optional.empty();
    }

    @Override
    @GetMapping("")
    public Optional<List<BookingDto>> findAll() {
        return Optional.empty();
    }

    @Override
    @DeleteMapping("/{id}")
    public Optional<BookingDto> deleteById(@PathVariable( "id" ) Integer id) {
        return Optional.empty();
    }

    @Override
    @PutMapping("/{id}")
    public Optional<BookingDto> archiveById(@PathVariable( "id" ) Integer id) {
        return Optional.empty();
    }
}
