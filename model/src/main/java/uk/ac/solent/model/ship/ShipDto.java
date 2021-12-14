package uk.ac.solent.model.ship;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.ac.solent.model.base.BaseModel;
import uk.ac.solent.model.booking.Service;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShipDto extends BaseModel {

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "passengers")
    private Integer passengers;

    @Column(name = "depth", nullable = false)
    private Integer depth;

    @Column(name = "size", nullable = false)
    private Integer size;

    @Column(name = "arrival")
    private Date arrival;

    @ElementCollection
    @Column(name = "services")
    private List<Service> services;

    @ElementCollection
    @Column(name = "inventory")
    private List<Inventory> inventory;
}
