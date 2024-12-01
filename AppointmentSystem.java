
import java.util.ArrayList;

public class AppointmentSystem {
    private ArrayList<Appointment> appointments = new ArrayList<>();

    // Methodd to create a new appointment
    public void createAppointment (Appointment appointment) {
        if (appointment !=null) {
            appointments.add(appointment);
            System.out.println ("Appointment created sucessfully!");
        } else {
            System.out.println ("Invalid appointment details.");
        }
    }

    // method to print all appointments
    public void printExistingAppointmetns() {
        if (appointments.isEmpty()) {
            System.out.println ("No appointments found.");
        } else {
            for (Appointment appt : appointments) {
                appt.displayDetails();
                System.out.println ("---------------------------");
            }
        }
    }
}

