package uk.ac.solent.dao.booking;

import org.springframework.stereotype.Component;
import uk.ac.solent.model.booking.BookingDao;
import uk.ac.solent.model.booking.BookingDto;

import java.util.List;
import java.util.Optional;

@Component
public class BookingDAOImpSpring implements BookingDao {

    @Override
    public Optional<BookingDto> create(BookingDto entity) {
        return Optional.empty();
    }

    @Override
    public Optional<BookingDto> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Optional<List<BookingDto>> findAll() {
        return Optional.empty();
    }

    @Override
    public Optional<BookingDto> save(BookingDto entity) {
        return Optional.empty();
    }

    @Override
    public Optional<BookingDto> deleteById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Optional<BookingDto> archiveById(Integer id) {
        return Optional.empty();
    }
}
