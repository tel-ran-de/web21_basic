package students;

public class Student extends Person {

    private String phone;

    public Student(String fName, String lName, String phone) {
        super(fName, lName);
        this.phone = phone;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return getlName() + " " + getfName();
    }
}
