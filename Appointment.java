public class Appointment {
    private String patientName;         // Name of patient
    private String patientPhone;        // Patient's phone
    private String timeSlot;            // Preferred time
    private HealthProfessional doctor;  // Selected health professional 

    // Default constructor
    public Appointment() {
        this.patientName = "Unknown";
        this.patientPhone = "0000000000";
        this.timeSlot = "00:00";
        this.doctor = null;
    }

    // Parameteriseed constructor
    public Appointment (String patientName, String patientPhone, String timeSlot, HealthProfessional doctor) {
        this.patientName = patientName;
        this.patientPhone = patientPhone;
        this.timeSlot = timeSlot;
        this.doctor = doctor;
    }
    
}