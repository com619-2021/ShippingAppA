package uk.ac.solent.route;

import java.util.List;
import java.util.Optional;

public class RouteDAOImpSpring implements RouteDao {
    @Override
    public Optional<RouteDto> getById(Integer id) {
        return null;
    }

    @Override
    public Optional<RouteDto> create(RouteDto route) {
        return null;
    }

    @Override
    public Optional<RouteDto> save(RouteDto route) {
        return null;
    }

    @Override
    public Optional<List<RouteDto>> getAll() {
        return null;
    }

    @Override
    public void archive(Integer id) {

    }

    @Override
    public void archive(RouteDto route) {

    }
}
