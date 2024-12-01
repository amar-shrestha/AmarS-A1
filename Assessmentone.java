public class Assessmentone {
    public static void main (String[] args) {
        GeneralPractitioner gp1 = new GeneralPractitioner(1, "Dr. Amar", "Family", "Granville");
        GeneralPractitioner gp2 = new GeneralPractitioner(2, "Dr. Rachana", "Pediatrics", "Rockdale");
        Surgeon surgeon1 = new Surgeon(3, "Dr. Aadrik", "Neurosurgery", "OT 1");
    
        // Appointments collection
        AppointmentSystem system = new AppointmentSystem();

        // Create appointments
        System.out.println ("Creating appointments...");
        system.createAppointment(new Appointment ("Rajesh Kunwar", "0405000000", "09:00 AM", gp1));
        system.createAppointment(new Appointment ("Anju Sapkota", "0422000001", "11:00 AM", gp2));
        system.createAppointment(new Appointment ("Anuska Karki", "0424000002", "11:30 AM", surgeon1));

        // Print all appointments
        System.out.println ("Printing all appointments...");
        system.printExistingAppointmetns();
    }
