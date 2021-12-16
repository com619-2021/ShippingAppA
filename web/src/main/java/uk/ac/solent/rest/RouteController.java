package uk.ac.solent.rest;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import uk.ac.solent.dao.route.RouteRepository;
import uk.ac.solent.model.route.RouteDto;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value ="/route", produces = "application/json")
@Transactional
public class RouteController implements BaseController<RouteDto>{

    private final RouteRepository routeRepository;

    public RouteController(RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }

    @Override
    @PostMapping("")
    public Optional<RouteDto> create(RouteDto entity) {
        return Optional.empty();
    }

    @Override
    @PatchMapping( "/{id}")
    public Optional<RouteDto> save(@PathVariable( "id" ) Integer id, RouteDto entity) {
        return Optional.empty();
    }

    @Override
    @GetMapping("/{id}")
    public Optional<RouteDto> findById(@PathVariable( "id" ) Integer id) {
        return Optional.empty();
    }

    @Override
    @GetMapping("")
    public Optional<List<RouteDto>> findAll() {
        return Optional.empty();
    }

    @Override
    @DeleteMapping("/{id}")
    public Optional<RouteDto> deleteById(@PathVariable( "id" ) Integer id) {
        return Optional.empty();
    }

    @Override
    @PutMapping("/{id}")
    public Optional<RouteDto> archiveById(@PathVariable( "id" ) Integer id) {
        return Optional.empty();
    }
}
