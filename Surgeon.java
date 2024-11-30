// Child Class: Surgeon
public class Surgeon extends HealthProfessional {
    private String operationTheater;         // Additonal attribute for Surgeons

    // Default constructor
    public Surgeon () {
        super();            // Call base class default constructor
        this.operationTheater = "Not assigned";
    }
    // Parameterised constructor
    public Surgeon (int id, String name, String specialisation, String operatingTheater) {
        super (id, name, specialisation);           // Call parent constructor
        this.operationTheater = operatingTheater;
    }

    // Overridden method to display details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.printIn ("Operationg Theater: " + operationTheater);
    }
}
