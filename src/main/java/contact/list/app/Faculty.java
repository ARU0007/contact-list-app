package contact.list.app;

public final class Faculty extends Contact {
    String departmentName;
    String designation;

    double salary;

    @Override
    public String toString() {
        return "Faculty{" +
                "departmentName='" + departmentName + '\'' +
                ", designation ='" + designation + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", email='" + email + '\'' +
                '}';
    }

    public Faculty(long id, String name, long phoneNumber, String email, String departmentName, String designation, double salary) {
        super(id, name, phoneNumber, email);
        this.departmentName = departmentName;
        this.designation = designation;
        this.salary = salary;
    }

    public Faculty(long id, String name, long phoneNumber, String email) {

        super(id, name, phoneNumber, email);
    }
}
