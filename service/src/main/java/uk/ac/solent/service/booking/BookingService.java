package uk.ac.solent.service.booking;

import org.springframework.stereotype.Service;
import uk.ac.solent.model.booking.BookingDto;
import uk.ac.solent.model.booking.BookingModelService;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService implements BookingModelService {

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
