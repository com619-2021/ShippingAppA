package uk.ac.solent.model.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.ac.solent.model.base.BaseModel;

import javax.persistence.Column;
import javax.persistence.Entity;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto extends BaseModel {

    @Column(name = "username", unique = true)
    private String username;

    @Column(name = "email", unique = true)
    private String email;

    @Column(name = "password")
    @JsonIgnore
    private String password;

}
