package uk.ac.solent.ship;

import uk.ac.solent.ship.ShipDao;
import uk.ac.solent.ship.ShipDto;

import java.util.List;

public class ShipDAOImpSpring implements ShipDao {
    @Override
    public ShipDto getById(Integer id) {
        return null;
    }

    @Override
    public ShipDto create(ShipDto booking) {
        return null;
    }

    @Override
    public ShipDto save(ShipDto booking) {
        return null;
    }

    @Override
    public List<ShipDto> getAll() {
        return null;
    }

    @Override
    public void archive(Integer id) {

    }

    @Override
    public void archive(ShipDto booking) {

    }
}
