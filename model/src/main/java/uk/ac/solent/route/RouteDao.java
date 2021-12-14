package uk.ac.solent.route;

import java.util.List;

public interface RouteDao {
    RouteDto getById(Integer id);
    RouteDto create(RouteDto booking);
    RouteDto save(RouteDto booking);
    List<RouteDto> getAll();
    void archive(Integer id);
    void archive(RouteDto booking);
}
