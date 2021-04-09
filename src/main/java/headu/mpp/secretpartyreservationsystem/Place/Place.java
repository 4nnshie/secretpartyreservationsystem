package headu.mpp.secretpartyreservationsystem.Place;

import javax.persistence.*;

@Entity
@Table(name = "place")
public class Place {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "history")
    private String history;

    @Column(name = "levelOfPrivacy")
    private Integer levelOfPrivacy;

    @Column(name = "AddressId")
    private Integer addressId;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHistory() {
        return this.history;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public Integer getLevelOfPrivacy() {
        return this.levelOfPrivacy;
    }

    public void setLevelOfPrivacy(Integer levelOfPrivacy) {
        this.levelOfPrivacy = levelOfPrivacy;
    }

    public Integer getAddressId() {
        return this.addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }
}
