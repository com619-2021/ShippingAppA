package uk.ac.solent.model.route;

import java.util.List;
import java.util.Optional;

public interface RouteDao {
    Optional<RouteDto> create(RouteDto entity);
    Optional<RouteDto> findById(Integer id);
    Optional<List<RouteDto>> findAll();
    Optional<RouteDto> save(RouteDto entity);
    Optional<RouteDto> deleteById(Integer id);
    Optional<RouteDto> archiveById(Integer id);
}
