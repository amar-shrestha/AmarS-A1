// Child Class: GeneralPractitioner
public class GeneralPractitioner extends HealthProfessional {
    private String clinicLocation;          // attribute for GP

    // Default constructor
    public GeneralPractitioner() {
        super();            // Calls base class default constructor
        this.clinicLocation = "Not specified";
    }

    // Parameterised constructor
    public GeneralPractitioner (int id, String name, String specialisation, String clinicLocation) {
        super (id, name, specialisation);           // Call base class parameterised constructor
        this.clinicLocation = clinicLocation;
    }

    // Overridden method to display details
    @Override
    public void displayDetails () {
        super.displayDetails();         // Call base class display method
        System.out.println ("Clinic Location: " + clinicLocation);
    }
}