package uk.ac.solent.booking.springData;

import org.springframework.data.jpa.repository.JpaRepository;
import uk.ac.solent.booking.BookingDto;

public interface BookingRepository extends JpaRepository<BookingDto, Integer> {
}
