
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

    // Method to cancel appointment
    public void cancelBooking (String phone) {
        Appointment toRemove = null;
        for (Appointment appt : appointments) {
            if (appt.patientPhone.equals (phone)) {
                toRemove = appt;
                break;
            }
        }
        if (toRemove != null) {
            appointments.remove (toRemove);
            System.out.println ("Appointment cancelled successfully.");
        } else {
            System.out.println ("No appointment found for the given phone Number.");
        }
    }
}

