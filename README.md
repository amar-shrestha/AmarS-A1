This project is a simple appointment booking system for a health service. It allows patients to book appointments with health professionals, and the choosed two health professionals are: General Practitioners (GPs) and Surgeons, and manage these appointments.
Features to include according to Assessment 1:

    HealthProfessional Base Class:
        A shared class for health professionals.
        Includes attributes - ID, name, and specialisation.

    Child Classes:
        GeneralPractitioner:
            Adds details - the GP's clinic location.
        Surgeon:
            Adds details - the operating theater.

    Appointment Class:
        Stores details about an appointment - the patient's name, phone, time slot, and the selected health professional.

    Appointment System:
        Manages a list of appointments using an ArrayList.
        Functions include:
            Adding a new appointment.
            Printing all appointments.
            Canceling an appointment by the patient’s phone number.
