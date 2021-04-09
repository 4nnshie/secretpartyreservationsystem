package headu.mpp.secretpartyreservationsystem.Reservation;

import javax.persistence.*;

@Entity
@Table(name = "reservation")
public class Reservation {
    @Id
    @Column(name = "id")
    private Integer id;

    @Column(name = "guestId")
    private Integer guestId;

    @Column(name = "status")
    private String status;

    @Column(name = "partyId")
    private Integer partyId;

    @Column(name = "passCode")
    private Integer passCode;

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getGuestId() {
        return this.guestId;
    }

    public void setGuestId(Integer guestId) {
        this.guestId = guestId;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getPartyId() {
        return this.partyId;
    }

    public void setPartyId(Integer partyId) {
        this.partyId = partyId;
    }

    public Integer getPassCode() {
        return this.passCode;
    }

    public void setPassCode(Integer passCode) {
        this.passCode = passCode;
    }
}
