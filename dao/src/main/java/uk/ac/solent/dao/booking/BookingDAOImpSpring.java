package uk.ac.solent.dao.booking;

import org.springframework.stereotype.Component;
import uk.ac.solent.model.booking.BookingDao;
import uk.ac.solent.model.booking.BookingDto;

import java.util.List;
import java.util.Optional;

@Component
public class BookingDAOImpSpring implements BookingDao {
    @Override
    public Optional<BookingDto> getById(Integer id) {
        return null;
    }

    @Override
    public Optional<BookingDto> create(BookingDto booking) {
        return null;
    }

    @Override
    public Optional<BookingDto> save(BookingDto booking) {
        return null;
    }

    @Override
    public Optional<List<BookingDto>> getAll() {
        return null;
    }

    @Override
    public void archive(Integer id) {

    }

    @Override
    public void archive(BookingDto booking) {

    }
}
