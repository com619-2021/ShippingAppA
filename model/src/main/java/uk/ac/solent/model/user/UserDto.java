package uk.ac.solent.model.user;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import uk.ac.solent.model.base.BaseModel;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashSet;
import java.util.Objects;
import javax.persistence.Transient;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Table;
import javax.persistence.Entity;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto extends BaseModel {

    @Column(name = "username", unique = true)
    private String username;

    @Column(name = "password")
    @JsonIgnore
    private String password;

    private String passwordConfirm;

    @Transient
    public String getPasswordConfirm() {
        return passwordConfirm;
    }

    public void setPasswordConfirm(String passwordConfirm) {
        this.passwordConfirm = passwordConfirm;
    }

}
