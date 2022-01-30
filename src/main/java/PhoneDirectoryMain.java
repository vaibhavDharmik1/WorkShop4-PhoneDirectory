public class PhoneDirectoryMain {
    public static void main(String[] args) {
        System.out.println(".......Welcome To PhoneDirectory System.......");

        PhoneDirectory phoneDirectory = new PhoneDirectory();
        phoneDirectory.addMemberInformation(
                new PersonDetails("Vaibhav", "Dharmik", "Manewada", "Nagpur",
                        "Maharashtra", 440024, "vaibhavdharmik55@gmail.com"),
                new Contacts("256843", "9834690975"));
        phoneDirectory.addMemberInformation(
                new PersonDetails("Ramu", "Dharmik", "Manewada", "Nagpur",
                        "Maharashtra", 440024, "ramudharmik@gmail.com"),
                new Contacts("462747", "7548889288"));
        phoneDirectory.addMemberInformation(
                new PersonDetails("Tushar", "Lohambare", "Chatrapati", "Nagpur",
                        "Maharashtra", 440076, "tushar@gmail.com"),
                new Contacts("295672", "9761567890"));
        phoneDirectory.addMemberInformation(
                new PersonDetails("Ayush", "Shende", "Urjanagar", "Chandrapur",
                        "Maharashtra", 111111, "ayush@gmail.com"),
                new Contacts("225400", "9685555555"));
        System.out.println();
        phoneDirectory.getPersonDetails(new Contacts("440007", "1234567890"));
        phoneDirectory.editPersonDetails(new Contacts("440007", "1234567890"), "addresscity", "Nagpur");
        //To check if person details got edited
        phoneDirectory.getPersonDetails(new Contacts("440007", "1234567890"));
        phoneDirectory.deletePersonDetails(new Contacts("440007", "1234567890"));
        //To check if person details got deleted
        phoneDirectory.getPersonDetails(new Contacts("440007", "1234567890"));
        //Get all Person Details
        phoneDirectory.displayAllPersonDetails();
    }
}