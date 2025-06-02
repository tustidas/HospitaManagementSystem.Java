
import java.util.*;

// --- Hospital Class ---
class Hospital {
    private String name;
    private String address;
    private String phoneNumber;
    private List<Department> departments = new ArrayList<>();
    private List<Staff> staff = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();

    // Constructors, Getters, Setters
}

// --- Department Class ---
class Department {
    private String name;
    private String code;
    private List<Staff> staffMembers = new ArrayList<>();

    // Constructors, Getters, Setters
}

// --- Abstract Staff Class ---
abstract class Staff {
    protected String staffId;
    protected String name;
    protected String address;
    protected String phone;
    protected String email;
    protected Department department;

    // Constructors, Getters, Setters
}

// --- Doctor Class ---
class Doctor extends Staff {
    private String specialization;
    private String licenseNumber;

    // Constructors, Getters, Setters
}

// --- Nurse Class ---
class Nurse extends Staff {
    private String shift;

    // Constructors, Getters, Setters
}

// --- Admin Class ---
class Admin extends Staff {
    private String role;

    // Constructors, Getters, Setters
}

// --- Patient Class ---
class Patient {
    private String patientId;
    private String name;
    private Date dateOfBirth;
    private String address;
    private String contactNumber;
    private String bloodGroup;
    private String gender;

    private List<Appointment> appointments = new ArrayList<>();
    private List<Treatment> treatments = new ArrayList<>();
    private List<Bill> bills = new ArrayList<>();

    // Constructors, Getters, Setters
}

// --- Appointment Class ---
class Appointment {
    private String appointmentId;
    private Date date;
    private String time;
    private String reason;
    private Patient patient;
    private Doctor doctor;

    // Constructors, Getters, Setters
}

// --- Treatment Class ---
class Treatment {
    private String treatmentId;
    private String description;
    private Date startDate;
    private Date endDate;
    private Doctor prescribedBy;
    private Patient patient;
    private List<Medication> medications = new ArrayList<>();

    // Constructors, Getters, Setters
}

// --- Medication Class ---
class Medication {
    private String medicationId;
    private String name;
    private String dosage;
    private String frequency;

    // Constructors, Getters, Setters
}

// --- Bill Class ---
class Bill {
    private String billId;
    private double amount;
    private Date dateIssued;
    private String status;
    private Patient patient;
    private List<Treatment> treatments = new ArrayList<>();

    // Constructors, Getters, Setters
}
