package uk.ac.solent.model.route;

import java.util.List;
import java.util.Optional;

public interface RouteDao {
    Optional<RouteDto> getById(Integer id);
    Optional<RouteDto> create(RouteDto route);
    Optional<RouteDto> save(RouteDto route);
    Optional<List<RouteDto>> getAll();
    void archive(Integer id);
    void archive(RouteDto route);
}
