package uk.ac.solent.model.booking;

import java.util.List;
import java.util.Optional;

public interface BookingDao {
    Optional<BookingDto> create(BookingDto entity);
    Optional<BookingDto> findById(Integer id);
    Optional<List<BookingDto>> findAll();
    Optional<BookingDto> save(BookingDto entity);
    Optional<BookingDto> deleteById(Integer id);
    Optional<BookingDto> archiveById(Integer id);
}
