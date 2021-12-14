package uk.ac.solent.route.spring;

import uk.ac.solent.route.RouteDao;
import uk.ac.solent.route.RouteDto;

import java.util.List;

public class RouteDAOImpSpring implements RouteDao {
    @Override
    public RouteDto getById(Integer id) {
        return null;
    }

    @Override
    public RouteDto create(RouteDto booking) {
        return null;
    }

    @Override
    public RouteDto save(RouteDto booking) {
        return null;
    }

    @Override
    public List<RouteDto> getAll() {
        return null;
    }

    @Override
    public void archive(Integer id) {

    }

    @Override
    public void archive(RouteDto booking) {

    }
}
