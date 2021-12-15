package uk.ac.solent.rest;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import uk.ac.solent.dao.ship.ShipRepository;
import uk.ac.solent.model.ship.ShipDto;

import java.util.List;
import java.util.Optional;

@RestController
@Transactional
public class ShipController implements BaseController<ShipDto>{

    private final ShipRepository shipRepository;

    public ShipController(ShipRepository shipRepository) {
        this.shipRepository = shipRepository;
    }

    @Override
    @PostMapping("")
    public Optional<ShipDto> create(ShipDto entity) {
        return Optional.empty();
    }

    @Override
    @PatchMapping( "/{id}")
    public Optional<ShipDto> save(@PathVariable( "id" ) Integer id, ShipDto entity) {
        return Optional.empty();
    }

    @Override
    @GetMapping("/{id}")
    public Optional<ShipDto> findById(@PathVariable( "id" ) Integer id) {
        return Optional.empty();
    }

    @Override
    @GetMapping("")
    public Optional<List<ShipDto>> findAll() {
        return Optional.empty();
    }

    @Override
    @DeleteMapping("/{id}")
    public Optional<ShipDto> deleteById(@PathVariable( "id" ) Integer id) {
        return Optional.empty();
    }

    @Override
    @PutMapping("/{id}")
    public Optional<ShipDto> archiveById(@PathVariable( "id" ) Integer id) {
        return Optional.empty();
    }
}
