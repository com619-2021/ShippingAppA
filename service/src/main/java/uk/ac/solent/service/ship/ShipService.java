package uk.ac.solent.service.ship;

import org.springframework.stereotype.Service;
import uk.ac.solent.model.ship.ShipDto;
import uk.ac.solent.model.ship.ShipModelService;

import java.util.List;
import java.util.Optional;

@Service
public class ShipService implements ShipModelService {

    @Override
    public Optional<ShipDto> create(ShipDto entity) {
        return Optional.empty();
    }

    @Override
    public Optional<ShipDto> findById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Optional<List<ShipDto>> findAll() {
        return Optional.empty();
    }

    @Override
    public Optional<ShipDto> save(ShipDto entity) {
        return Optional.empty();
    }

    @Override
    public Optional<ShipDto> deleteById(Integer id) {
        return Optional.empty();
    }

    @Override
    public Optional<ShipDto> archiveById(Integer id) {
        return Optional.empty();
    }
}
