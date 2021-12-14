package uk.ac.solent.route.springData;

import org.springframework.data.jpa.repository.JpaRepository;
import uk.ac.solent.route.RouteDto;

public interface RouteRepository extends JpaRepository<RouteDto, Integer> {
}
