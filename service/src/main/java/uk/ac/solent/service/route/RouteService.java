package uk.ac.solent.service.route;

import org.springframework.stereotype.Service;
import uk.ac.solent.model.route.RouteDto;
import uk.ac.solent.model.route.RouteModelService;

import java.util.List;
import java.util.Optional;

@Service
public class RouteService implements RouteModelService {

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
