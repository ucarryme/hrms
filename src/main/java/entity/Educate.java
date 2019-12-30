package entity;

import java.sql.Timestamp;
import java.util.Objects;

public class Educate {
    private int id;
    private String name;
    private String purpose;
    private Timestamp begintime;
    private Timestamp endtime;
    private String datum;
    private String teacher;
    private String student;
    private Timestamp createtime;
    private boolean educate;
    private String effect;
    private String summarize;

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

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    public Timestamp getBegintime() {
        return begintime;
    }

    public void setBegintime(Timestamp begintime) {
        this.begintime = begintime;
    }

    public Timestamp getEndtime() {
        return endtime;
    }

    public void setEndtime(Timestamp endtime) {
        this.endtime = endtime;
    }

    public String getDatum() {
        return datum;
    }

    public void setDatum(String datum) {
        this.datum = datum;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    public boolean isEducate() {
        return educate;
    }

    public void setEducate(boolean educate) {
        this.educate = educate;
    }

    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    public String getSummarize() {
        return summarize;
    }

    public void setSummarize(String summarize) {
        this.summarize = summarize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Educate educate1 = (Educate) o;
        return id == educate1.id &&
                educate == educate1.educate &&
                Objects.equals(name, educate1.name) &&
                Objects.equals(purpose, educate1.purpose) &&
                Objects.equals(begintime, educate1.begintime) &&
                Objects.equals(endtime, educate1.endtime) &&
                Objects.equals(datum, educate1.datum) &&
                Objects.equals(teacher, educate1.teacher) &&
                Objects.equals(student, educate1.student) &&
                Objects.equals(createtime, educate1.createtime) &&
                Objects.equals(effect, educate1.effect) &&
                Objects.equals(summarize, educate1.summarize);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, purpose, begintime, endtime, datum, teacher, student, createtime, educate, effect, summarize);
    }
}
