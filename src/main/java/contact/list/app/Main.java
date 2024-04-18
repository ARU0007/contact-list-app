package contact.list.app;

public class Main {
    public static void main(String[] args) {
        Contact contact1 =
                new Contact(4L,
                "aac",234567876543L,"ac@mail.com");
        ContactList list = new ContactList();

        Contact contact2 =
                new Contact(44L,
                        "abc",234567676543L,"abc@mail.com");
        Contact contact3 =
                new Contact(45L,
                        "acc",2345676543L,"acc@mail.com");
        Contact contact4 =
                new Contact(46L,
                        "adc",2347876543L,"adc@mail.com");
        Contact contact5 =
                new Contact(47L,
                        "aec",2347811143L,"aec@mail.com");


        list.addContact(contact1);
        list.addContact(contact2);
        list.addContact(contact3);
        list.addContact(contact4);
        list.addContact(contact5);



    }

}
