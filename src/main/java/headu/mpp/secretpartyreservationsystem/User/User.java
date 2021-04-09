package headu.mpp.secretpartyreservationsystem.User;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private String name;
    @Column(name = "password")
    private String password;
    @Column(name = "email")
    private String email;

    @Column(name = "dateOfbirth")
    private java.sql.Date dateOfbirth;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public java.sql.Date getDateOfbirth() {
        return this.dateOfbirth;
    }

    public void setDateOfbirth(java.sql.Date dateOfbirth) {
        this.dateOfbirth = dateOfbirth;
    }
}