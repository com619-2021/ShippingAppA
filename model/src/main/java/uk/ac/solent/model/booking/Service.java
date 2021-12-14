package uk.ac.solent.model.booking;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    public String name;
    @ElementCollection()
    public List<Characteristic> characteristics;
    public String executor;
    public String resourceType;
}