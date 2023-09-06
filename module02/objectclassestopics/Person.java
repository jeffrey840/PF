package module02.objectclassestopics;
import java.util.Date;

public class Person {
    private Long id;
    private String fname;
    private String Iname;
    private int streetNo;
    private String streetName;
    private String city;
    private String state;
    private Integer zip;
    private Long phone;
    private Float salary;
    public static int count;
    java.util.Date creationDate;
    public Boolean isMember;
    private String defaultPassword;

    public Person() {
        super();
        count++;
        id = (long) MyRandomPersonData.randomNumber(14370001,14379999);
        fname = MyRandomPersonData.randomFname();
        Iname = MyRandomPersonData.randomLname();
        streetNo = MyRandomPersonData.randomNumber(1,23_002);
        streetName = MyRandomPersonData.randomStreet();
        city = MyRandomPersonData.randomCity();
        state = MyRandomPersonData.randomState();
        zip = Math.abs((int) MyRandomPersonData.randomNumber(23000L,89000L));
        phone = MyRandomPersonData.randomBigNumber(222_222_0099L, 999_888_9988L);
        salary = Math.abs((float) MyRandomPersonData.randomNumber(55_000, 175_000));
        creationDate = new java.util.Date();
        creationDate.setTime(System.currentTimeMillis());
        defaultPassword = password();
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

    public String getIname() {
        return Iname;
    }

    public void setIname(String iname) {
        Iname = iname;
    }

    public int getStreetNo() {
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

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
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

    public Person(Person p) {
        id = p.getId();
        fname = p.getFname();
        Iname = p.getLname();
        streetNo = p.getStreetNo();
        streetName = p.getStreetName();
        city = p.getCity();
        state = p.getState();
        zip = p.getZip();
        phone = p.getPhone();
        salary = p.getSalary();
        creationDate = p.getCreationDate();
    }

    private String getLname() {
        return null;
    }

    public Person(Long id, String fname, String Iname, Short streetNo, String streetName, String city, String state, Integer zip, Long phone, Float salary, Date creationDate, Boolean isMember, String defaultPassword) {
        super();
        this.id = id;
        this.fname = fname;
        this.Iname = Iname;
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

    private String password() {
        String x = ("" + id).substring(1,3);
        x += ("" + fname).substring(1,3);
        x += ("" + phone).substring(1,3);
        x += ("" + creationDate).substring(1,3);
        x += ("" + streetName).substring(1,3);
        return x.trim().toLowerCase();
    }

    // getters and setters

    public void display() {
        System.out.println("row: [" + count + "]");
        // ... (rest of the display code)
    }

    public String printPerson() {
        return "Person [id=" + id + ", fname=" + fname + ", Iname=" + Iname + ", streetNo=" + streetNo + ", streetName=" + streetName + ", city=" + city + ", state=" + state + ", zip=" + zip + ", phone=" + phone + ", salary=" + salary + ", creationDate=" + creationDate + ", isMember=" + isMember + ", defaultPassword=" + defaultPassword + "]";
    }

    @Override
    public String toString() {
        return "Person [id=" + id + ", fname=" + fname + ", Iname=" + Iname + ", streetNo=" + streetNo + ", streetName=" + streetName + ", city=" + city + ", state=" + state + ", zip=" + zip + ", phone=" + phone + ", salary=" + salary + ", creationDate=" + creationDate + ", isMember=" + isMember + ", defaultPassword=" + defaultPassword + "]";
    }
}
