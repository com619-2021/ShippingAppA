package uk.ac.solent.model.base;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor(force = true)
public class BaseModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private final Integer id;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at", nullable = false, updatable = false)
    @CreatedDate
    private Date createdAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "updated_at", nullable = false)
    @LastModifiedDate
    private Date updatedAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "archived", nullable = false)
    private Date archived;

    @Version
    private int version;

}
