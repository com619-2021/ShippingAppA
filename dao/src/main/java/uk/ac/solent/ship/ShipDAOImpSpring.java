package uk.ac.solent.ship;

import uk.ac.solent.ship.ShipDao;
import uk.ac.solent.ship.ShipDto;

import java.util.List;
import java.util.Optional;

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
