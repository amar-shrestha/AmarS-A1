public class HealthProfessional {
    private int id;                 // Unique ID for health professional
    private String name;            // Name of health professional
    private String specialisation;  // Specialisation 

    // Default constructor
    public HealthProfessional() {
        this.id = 0;
        this.name = "Unknown";
        this.specialisation = "General";
    }

    // Parameterised constructor
    public HealthProfessional (int id, String name, String specialisation) {
        this.id = id;
        this.name = name;
        this.specialisation = specialisation;
    }



