package uk.ac.solent.rest;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import uk.ac.solent.dao.route.RouteRepository;
import uk.ac.solent.model.route.RouteDto;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping(path ="/api/route", produces = "application/json")
public class RouteController implements BaseController<RouteDto>{

    private final RouteRepository routeRepository;
    private static final List<RouteDto> routes = new ArrayList<>();

    public RouteController(RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }

    @Override
    @PostMapping("/api/route")
    public void add(@Valid @RequestBody RouteDto entity) {
        routes.add(entity);
    }
    @Override
    @PatchMapping(value = "/api/route/{id}")
    public RouteDto save(@PathVariable( "id" ) Integer id, RouteDto entity) {
        return null;
    }

    @Override
    @GetMapping(value ="/api/route/{id}", produces = {org.springframework.http.MediaType.APPLICATION_JSON_VALUE})
    public RouteDto findById(@RequestParam Integer id) {
        return routes.stream().filter(route -> route.getId() == id).findFirst().orElse(null);
    }

    @Override
    @GetMapping(value ="/api/route", produces = {org.springframework.http.MediaType.APPLICATION_JSON_VALUE})
    public List<RouteDto> findAll() {
        return routes;
    }
    @Override
    @DeleteMapping(value ="/api/route/{id}")
    public void deleteById(@PathVariable( "id" ) Integer id) {

    }

    @Override
    @PutMapping(value ="/api/route/{id}")
    public RouteDto archiveById(@PathVariable( "id" ) Integer id) {
        return null;
    }
}
