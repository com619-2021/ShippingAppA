package uk.ac.solent.ship.springData;

import org.springframework.data.jpa.repository.JpaRepository;
import uk.ac.solent.ship.ShipDto;

public interface ShipRepository extends JpaRepository<ShipDto, Integer> {
}
