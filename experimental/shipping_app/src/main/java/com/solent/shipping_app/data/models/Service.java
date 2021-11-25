package com.solent.shipping_app.data.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class Service {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    public String name;
    @ElementCollection
    public List<Characteristic> characteristics;
    public String executor;
    public String resourceType;
}