package uk.ac.solent.dao.ship;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uk.ac.solent.model.ship.ShipDto;

@Repository
public interface ShipRepository extends JpaRepository<ShipDto, Integer> {
}
