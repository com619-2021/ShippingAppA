package uk.ac.solent.model.ship;

import java.util.List;
import java.util.Optional;

public interface ShipDao {
    Optional<ShipDto> create(ShipDto entity);
    Optional<ShipDto> findById(Integer id);
    Optional<List<ShipDto>> findAll();
    Optional<ShipDto> save(ShipDto entity);
    Optional<ShipDto> deleteById(Integer id);
    Optional<ShipDto> archiveById(Integer id);
}
