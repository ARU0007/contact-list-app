package contact.list.app;

public class Student extends Contact {
    long universityRollNumber;
    String section;

    public Student(long id, String name, long phoneNumber, String email, long universityRollNumber, String section, double cpi) {
        super(id, name, phoneNumber, email);
        this.universityRollNumber = universityRollNumber;
        this.section = section;
        this.cpi = cpi;
    }

    double cpi;



    public Student(long id, String name, long phoneNumber, String email) {

        super(id, name, phoneNumber, email);
    }
}
