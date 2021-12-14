package uk.ac.solent.model.booking;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import uk.ac.solent.model.base.BaseModel;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "booking")
@AllArgsConstructor
@NoArgsConstructor
public class BookingDto extends BaseModel {

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "startDate", nullable = false)
    private Date startDate;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "endDate", nullable = false)
    private Date endDate;

    @ElementCollection
    @Column(name = "services")
    private List<Service> services;
}
