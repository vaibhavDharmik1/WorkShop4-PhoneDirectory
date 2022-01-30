import java.util.ArrayList;

public class PhoneDirectorySystemMain {
    public static void main(String[] args) {
        PhoneDirectorySystem phoneDirectorySystem = new PhoneDirectorySystem();
        PhoneDirectory phoneDirectory1 = new PhoneDirectory();
        phoneDirectory1.addMemberInformation(
                new PersonDetails("Vaibhav", "Dharmik", "Manewada", "Nagpur",
                        "Maharashtra", 440024, "vaibhavdharmik55@gmail.com"),
                new Contacts("245433", "9834690975"));
        phoneDirectory1.addMemberInformation(
                new PersonDetails("Ramu", "Dharmik", "Manewada", "Nagpur",
                        "Maharashtra", 440024, "ramudharmik@gmail.com"),
                new Contacts("462747", "7548889288"));
        phoneDirectory1.addMemberInformation(
                new PersonDetails("Tushar", "Lohambare", "Chatrapati", "Nagpur",
                        "Maharashtra", 440076, "tushar@gmail.com"),
                new Contacts("256272", "1234567890"));
        PhoneDirectory phoneDirectory2 = new PhoneDirectory();
        phoneDirectory2.addMemberInformation(
                new PersonDetails("Vaibhav", "Dharmik", "Manewada", "Nagpur",
                        "Maharashtra", 440024, "vaibhavdharmik55@gmail.com"),
                new Contacts("245433", "9834690975"));
        phoneDirectory2.addMemberInformation(
                new PersonDetails("Ramu", "Dharmik", "Manewada", "Nagpur",
                        "Maharashtra", 440024, "ramudharmik@gmail.com"),
                new Contacts("462747", "7548888888"));
        phoneDirectory2.addMemberInformation(
                new PersonDetails("Tushar", "Lohambare", "Chatrapati", "Nagpur",
                        "Maharashtra", 440076, "tushar@gmail.com"),
                new Contacts("256272", "1234567890"));
        ArrayList<PhoneDirectory> phoneDirectories = new ArrayList<>();
        phoneDirectories.add(phoneDirectory1);
        phoneDirectories.add(phoneDirectory2);

        phoneDirectorySystem.addPhoneDirectories(phoneDirectories);
        phoneDirectorySystem.getPhoneDirectoryList();
    }
}