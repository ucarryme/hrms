package entity;

import java.sql.Timestamp;
import java.util.Objects;

public class Stipend {
    private int id;
    private String name;
    private Double basic;
    private Double eat;
    private Double house;
    private Double duty;
    private Double scot;
    private Double punishment;
    private Double other;
    private Timestamp granttime;
    private Double totalize;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBasic() {
        return basic;
    }

    public void setBasic(Double basic) {
        this.basic = basic;
    }

    public Double getEat() {
        return eat;
    }

    public void setEat(Double eat) {
        this.eat = eat;
    }

    public Double getHouse() {
        return house;
    }

    public void setHouse(Double house) {
        this.house = house;
    }

    public Double getDuty() {
        return duty;
    }

    public void setDuty(Double duty) {
        this.duty = duty;
    }

    public Double getScot() {
        return scot;
    }

    public void setScot(Double scot) {
        this.scot = scot;
    }

    public Double getPunishment() {
        return punishment;
    }

    public void setPunishment(Double punishment) {
        this.punishment = punishment;
    }

    public Double getOther() {
        return other;
    }

    public void setOther(Double other) {
        this.other = other;
    }

    public Timestamp getGranttime() {
        return granttime;
    }

    public void setGranttime(Timestamp granttime) {
        this.granttime = granttime;
    }

    public Double getTotalize() {
        return totalize;
    }

    public void setTotalize(Double totalize) {
        this.totalize = totalize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stipend stipend = (Stipend) o;
        return id == stipend.id &&
                Objects.equals(name, stipend.name) &&
                Objects.equals(basic, stipend.basic) &&
                Objects.equals(eat, stipend.eat) &&
                Objects.equals(house, stipend.house) &&
                Objects.equals(duty, stipend.duty) &&
                Objects.equals(scot, stipend.scot) &&
                Objects.equals(punishment, stipend.punishment) &&
                Objects.equals(other, stipend.other) &&
                Objects.equals(granttime, stipend.granttime) &&
                Objects.equals(totalize, stipend.totalize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, basic, eat, house, duty, scot, punishment, other, granttime, totalize);
    }
}
