package uk.ac.solent.model.ship;

import java.util.List;
import java.util.Optional;

public interface ShipDao {
    Optional<ShipDto> getById(Integer id);
    Optional<ShipDto> create(ShipDto ship);
    Optional<ShipDto> save(ShipDto ship);
    Optional<List<ShipDto>> getAll();
    void archive(Integer id);
    void archive(ShipDto ship);
}
