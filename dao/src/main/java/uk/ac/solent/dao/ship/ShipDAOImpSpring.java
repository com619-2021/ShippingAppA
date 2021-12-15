package uk.ac.solent.dao.ship;

import org.springframework.stereotype.Component;
import uk.ac.solent.model.ship.ShipDao;
import uk.ac.solent.model.ship.ShipDto;

import java.util.List;
import java.util.Optional;

@Component
public class ShipDAOImpSpring implements ShipDao {

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
