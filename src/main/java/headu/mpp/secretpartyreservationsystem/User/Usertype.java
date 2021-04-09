package headu.mpp.secretpartyreservationsystem.User;

import javax.persistence.*;

@Entity
@Table(name = "usertype")
public class Usertype {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "idUser")
    private Integer idUser;

    @Column(name = "type")
    private String type;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getIdUser() {
        return this.idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
