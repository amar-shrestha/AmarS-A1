// Child Class: Surgeon
public class Surgeon extends HealthProfessional {
    private String operationTheater;         // Additonal attribute for Surgeons

    // Default constructor
    public Surgeon () {
        super();            // Call base class default constructor
        this.operationTheater = "Not assigned";
    }
}
