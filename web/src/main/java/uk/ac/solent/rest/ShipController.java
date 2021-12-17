package uk.ac.solent.rest;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import uk.ac.solent.dao.ship.ShipRepository;
import uk.ac.solent.model.ship.ShipDto;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
//@RequestMapping(path ="/api/ship", produces = "application/json")
@Transactional
public class ShipController implements BaseController<ShipDto>{

    private final ShipRepository shipRepository;

    public ShipController(ShipRepository shipRepository) {
        this.shipRepository = shipRepository;
    }

    @Override
    @PostMapping("/api/ship")
    public ShipDto create(ShipDto entity) {
        return null;
    }

    @Override
    @PatchMapping(value ="/api/ship/{id}")
    public ShipDto save(@PathVariable( "id" ) Integer id, ShipDto entity) {
        return null;
    }

    @Override
    @GetMapping(value ="/api/ship/{id}")
    public ShipDto findById(@PathVariable( "id" ) Integer id) {
        return null;
    }

    @Override
    @GetMapping(value ="/api/ship")
    public List<ShipDto> findAll() {
        return Collections.emptyList();
    }

    @Override
    @DeleteMapping(value ="/api/ship/{id}")
    public ShipDto deleteById(@PathVariable( "id" ) Integer id) {
        return null;
    }

    @Override
    @PutMapping(value ="/api/ship/{id}")
    public ShipDto archiveById(@PathVariable( "id" ) Integer id) {
        return null;
    }
}
