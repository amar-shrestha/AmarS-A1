// Child Class: GeneralPractitioner
public class GeneralPractitioner extends HealthProfessional {
    private String clinicLocation;          // attribute for GP

    // Default constructor
    public GeneralPractitioner() {
        super();            // Calls base class default constructor
        this.clinicLocation = "Not specified";
    }
}
