package uk.ac.solent.booking;

import java.util.List;
import java.util.Optional;

public interface BookingDao {
    Optional<BookingDto> getById(Integer id);
    Optional<BookingDto> create(BookingDto booking);
    Optional<BookingDto> save(BookingDto booking);
    Optional<List<BookingDto>> getAll();
    void archive(Integer id);
    void archive(BookingDto booking);
}
