package uk.ac.solent.ship;

import java.util.List;

public interface ShipDao {
    ShipDto getById(Integer id);
    ShipDto create(ShipDto booking);
    ShipDto save(ShipDto booking);
    List<ShipDto> getAll();
    void archive(Integer id);
    void archive(ShipDto booking);
}
