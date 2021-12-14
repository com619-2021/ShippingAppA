package uk.ac.solent.booking;

import java.util.List;

public interface BookingDao {
    BookingDto getById(Integer id);
    BookingDto create(BookingDto booking);
    BookingDto save(BookingDto booking);
    List<BookingDto> getAll();
    void archive(Integer id);
    void archive(BookingDto booking);
}
