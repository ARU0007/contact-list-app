package contact.list.app;

public class Contact {
    long id;
    String name;
    long phoneNumber;
    String email;

    public Contact(long id, String name, long phoneNumber, String email) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
}
