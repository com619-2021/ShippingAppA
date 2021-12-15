package uk.ac.solent.dao.route;

import org.springframework.stereotype.Component;
import uk.ac.solent.model.route.RouteDao;
import uk.ac.solent.model.route.RouteDto;

import java.util.List;
import java.util.Optional;

@Component
public class RouteDAOImpSpring implements RouteDao {

    @Override
    public Optional<RouteDto> create(RouteDto entity) {
        return Optional.empty();
    }

    @Override
    public Optional<RouteDto> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Optional<List<RouteDto>> findAll() {
        return Optional.empty();
    }

    @Override
    public Optional<RouteDto> save(RouteDto entity) {
        return Optional.empty();
    }

    @Override
    public Optional<RouteDto> deleteById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Optional<RouteDto> archiveById(Integer id) {
        return Optional.empty();
    }
}
