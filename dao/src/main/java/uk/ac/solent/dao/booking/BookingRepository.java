package uk.ac.solent.dao.booking;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uk.ac.solent.model.booking.BookingDto;

@Repository
public interface BookingRepository extends JpaRepository<BookingDto, Integer> {
}
