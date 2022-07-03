package uk.ac.solent.rest;

import com.sun.tools.sjavac.Log;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import uk.ac.solent.dao.ship.ShipRepository;
import uk.ac.solent.model.ship.ShipDto;
import javax.validation.Valid;
import java.util.*;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
//@RequestMapping(path ="/api/ship", produces = "application/json")
//@Transactional
public class ShipController implements BaseController<ShipDto>{

    private final ShipRepository shipRepository;
    private static final List<ShipDto> ships = new ArrayList<>();

    public ShipController(ShipRepository shipRepository) {
        this.shipRepository = shipRepository;
    }


    @Override
    @PostMapping("/api/ship")
    public void add(@Valid @RequestBody ShipDto entity) {
        ships.add(entity);
    }

    @Override
    @PatchMapping(value ="/api/ship/{id}", produces = {org.springframework.http.MediaType.APPLICATION_JSON_VALUE})
    public ShipDto save(@PathVariable( "id" ) Integer id, ShipDto entity) {
        return null;
    }

    @Override
    @GetMapping(value ="/api/ship/{id}", produces = {org.springframework.http.MediaType.APPLICATION_JSON_VALUE})
    public ShipDto findById(@RequestParam Integer id) {
        return ships.stream().filter(ship -> ship.getId() == id).findFirst().orElse(null);
    }

    @Override
    @GetMapping(value ="/api/ship", produces = {org.springframework.http.MediaType.APPLICATION_JSON_VALUE})
    public List<ShipDto> findAll() {
        return ships;
    }

    @Override
    @RequestMapping(value = "/api/ship/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void deleteById(@PathVariable( "id" ) Integer id) {
        Log.warn("HELOOO");
        Log.debug(ships.get(0).getId().toString());
        ships.stream().filter(ship -> ship.getId().toString() == String.valueOf(id)).findFirst().ifPresent(ships::remove);
    }



    @Override
    @PutMapping(value ="/api/ship/{id}", produces = {org.springframework.http.MediaType.APPLICATION_JSON_VALUE})
    public ShipDto archiveById(@PathVariable( "id" ) Integer id) {
        return null;
    }
}
