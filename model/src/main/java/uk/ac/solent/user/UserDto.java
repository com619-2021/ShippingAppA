package uk.ac.solent.user;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.ac.solent.base.BaseModel;

import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto extends BaseModel {

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "password")
    private String password;

}
