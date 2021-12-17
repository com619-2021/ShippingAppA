package uk.ac.solent.rest;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import uk.ac.solent.dao.route.RouteRepository;
import uk.ac.solent.model.route.RouteDto;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping(path ="/api/route", produces = "application/json")
@Transactional
public class RouteController implements BaseController<RouteDto>{

    private final RouteRepository routeRepository;

    public RouteController(RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }

    @Override
    @PostMapping(value ="/api/route")
    public RouteDto create(RouteDto entity) {
        return null;
    }

    @Override
    @PatchMapping(value = "/api/route/{id}")
    public RouteDto save(@PathVariable( "id" ) Integer id, RouteDto entity) {
        return null;
    }

    @Override
    @GetMapping(value ="/api/route/{id}")
    public RouteDto findById(@PathVariable( "id" ) Integer id) {
        return null;
    }

    @Override
    @GetMapping(value ="/api/route")
    public List<RouteDto> findAll() {
        return Collections.emptyList();
    }

    @Override
    @DeleteMapping(value ="/api/route/{id}")
    public RouteDto deleteById(@PathVariable( "id" ) Integer id) {
        return null;
    }

    @Override
    @PutMapping(value ="/api/route/{id}")
    public RouteDto archiveById(@PathVariable( "id" ) Integer id) {
        return null;
    }
}
