package uk.ac.solent.model.user;

import javax.persistence.*;
import java.util.Set;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)

@Entity
@Table(name = "role")
public class Role {

    public Role(){
        super();
    }

    public Role(UserRoles userRole){
        super();
        name = userRole.toString();
    }

    private Long id;
    private String name;

    @XmlElementWrapper(name = "users")
    @XmlElement(name = "user")
    private Set<UserDto> users;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUsers(Set<UserDto> users) {
        this.users = users;
    }

}