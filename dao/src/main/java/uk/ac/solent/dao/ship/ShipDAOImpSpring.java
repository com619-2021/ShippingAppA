package uk.ac.solent.dao.ship;

import org.springframework.stereotype.Component;
import uk.ac.solent.model.ship.ShipDao;
import uk.ac.solent.model.ship.ShipDto;

import java.util.List;
import java.util.Optional;

@Component
public class ShipDAOImpSpring implements ShipDao {
    @Override
    public Optional<ShipDto> getById(Integer id) {
        return null;
    }

    @Override
    public Optional<ShipDto> create(ShipDto ship) {
        return null;
    }

    @Override
    public Optional<ShipDto> save(ShipDto ship) {
        return null;
    }

    @Override
    public Optional<List<ShipDto>> getAll() {
        return null;
    }

    @Override
    public void archive(Integer id) {

    }

    @Override
    public void archive(ShipDto ship) {

    }
}
