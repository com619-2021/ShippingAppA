package uk.ac.solent.booking;

import uk.ac.solent.booking.BookingDao;
import uk.ac.solent.booking.BookingDto;

import java.util.List;

public class BookingDAOImpSpring implements BookingDao {
    @Override
    public BookingDto getById(Integer id) {
        return null;
    }

    @Override
    public BookingDto create(BookingDto booking) {
        return null;
    }

    @Override
    public BookingDto save(BookingDto booking) {
        return null;
    }

    @Override
    public List<BookingDto> getAll() {
        return null;
    }

    @Override
    public void archive(Integer id) {

    }

    @Override
    public void archive(BookingDto booking) {

    }
}
