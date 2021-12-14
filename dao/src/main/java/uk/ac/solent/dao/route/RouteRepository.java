package uk.ac.solent.dao.route;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uk.ac.solent.model.route.RouteDto;

@Repository
public interface RouteRepository extends JpaRepository<RouteDto, Integer> {
}
