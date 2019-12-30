package entity;

import java.sql.Timestamp;
import java.util.Objects;

public class Job {
    private int id;
    private String name;
    private Boolean sex;
    private Integer age;
    private String job;
    private String specialty;
    private String experience;
    private String studyeffort;
    private String school;
    private String tel;
    private String email;
    private Timestamp createtime;
    private String content;
    private Boolean isstock;

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

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getStudyeffort() {
        return studyeffort;
    }

    public void setStudyeffort(String studyeffort) {
        this.studyeffort = studyeffort;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Timestamp getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Timestamp createtime) {
        this.createtime = createtime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getIsstock() {
        return isstock;
    }

    public void setIsstock(Boolean isstock) {
        this.isstock = isstock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job1 = (Job) o;
        return id == job1.id &&
                Objects.equals(name, job1.name) &&
                Objects.equals(sex, job1.sex) &&
                Objects.equals(age, job1.age) &&
                Objects.equals(job, job1.job) &&
                Objects.equals(specialty, job1.specialty) &&
                Objects.equals(experience, job1.experience) &&
                Objects.equals(studyeffort, job1.studyeffort) &&
                Objects.equals(school, job1.school) &&
                Objects.equals(tel, job1.tel) &&
                Objects.equals(email, job1.email) &&
                Objects.equals(createtime, job1.createtime) &&
                Objects.equals(content, job1.content) &&
                Objects.equals(isstock, job1.isstock);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, sex, age, job, specialty, experience, studyeffort, school, tel, email, createtime, content, isstock);
    }
}
