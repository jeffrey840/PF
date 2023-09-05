package module02.objectclassestopics;

import java.util.Date;

public class Person {
    private Long id;
    private String fname;
    private String lname;
    private Short streetNo;
    private String streetName;
    private String city;
    private String state;
    private Integer zip;
    private Long phone;
    private Float salary;
    private Integer creationDate;
    private Boolean isMember;
    private String defaultPassword;

    public Person(Long id, String fname, String lname, Short streetNo, String streetName, String city, String state, Integer zip, Long phone, Float salary, Integer creationDate, Boolean isMember, String defaultPassword) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.streetNo = streetNo;
        this.streetName = streetName;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.salary = salary;
        this.creationDate = creationDate;
        this.isMember = isMember;
        this.defaultPassword = defaultPassword;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public Short getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(Short streetNo) {
        this.streetNo = streetNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Integer getZip() {
        return zip;
    }

    public void setZip(Integer zip) {
        this.zip = zip;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    public Float getSalary() {
        return salary;
    }

    public void setSalary(Float salary) {
        this.salary = salary;
    }

    public Integer getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Integer creationDate) {
        this.creationDate = creationDate;
    }

    public Boolean getMember() {
        return isMember;
    }

    public void setMember(Boolean member) {
        isMember = member;
    }

    public String getDefaultPassword() {
        return defaultPassword;
    }

    public void setDefaultPassword(String defaultPassword) {
        this.defaultPassword = defaultPassword;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", fname='" + fname + '\'' +
                ", lname='" + lname + '\'' +
                ", streetNo=" + streetNo +
                ", streetName='" + streetName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", phone=" + phone +
                ", salary=" + salary +
                ", creationDate=" + creationDate +
                ", isMember=" + isMember +
                ", defaultPassword='" + defaultPassword + '\'' +
                '}';
    }

}

