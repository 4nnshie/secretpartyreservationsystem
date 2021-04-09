package headu.mpp.secretpartyreservationsystem.Party;

import javax.persistence.*;

@Entity
@Table(name = "party")
public class Party {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "capacity")
    private Integer capacity;

    @Column(name = "placeId")
    private Integer placeId;

    @Column(name = "dresscode")
    private String dresscode;

    @Column(name = "name")
    private String name;

    @Column(name = "partyDate")
    private String partyDate;

    @Column(name = "partyTime")
    private String partyTime;

    @Column(name = "hostId")
    private Integer hostId;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCapacity() {
        return this.capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getPlaceId() {
        return this.placeId;
    }

    public void setPlaceId(Integer placeId) {
        this.placeId = placeId;
    }

    public String getDresscode() {
        return this.dresscode;
    }

    public void setDresscode(String dresscode) {
        this.dresscode = dresscode;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPartyDate() {
        return this.partyDate;
    }

    public void setPartyDate(String partyDate) {
        this.partyDate = partyDate;
    }

    public String getPartyTime() {
        return this.partyTime;
    }

    public void setPartyTime(String partyTime) {
        this.partyTime = partyTime;
    }

    public Integer getHostId() {
        return this.hostId;
    }

    public void setHostId(Integer hostId) {
        this.hostId = hostId;
    }
}


