package AbstractPolymorphismEncapsulation;

import java.util.*;

// Interface to manage medical records
interface MedicalRecord {
    void addRecord(String diagnosis);
    List<String> viewRecords();
}

// Abstract base class for all patients
abstract class Patient {
    private String patientId;
    private String name;
    private int age;
    private List<String> medicalHistory = new ArrayList<>();

    public Patient(String patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Encapsulation: accessors
    public String getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    protected void addToMedicalHistory(String record) {
        medicalHistory.add(record);
    }

    protected List<String> getMedicalHistory() {
        return new ArrayList<>(medicalHistory); // defensive copy
    }

    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId + ", Name: " + name + ", Age: " + age);
    }

    public abstract double calculateBill(); // to be implemented differently
}

// InPatient class
class InPatient extends Patient implements MedicalRecord {
    private int daysAdmitted;
    private double dailyRate;

    public InPatient(String patientId, String name, int age, int daysAdmitted, double dailyRate) {
        super(patientId, name, age);
        this.daysAdmitted = daysAdmitted;
        this.dailyRate = dailyRate;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted * dailyRate;
    }

    @Override
    public void addRecord(String diagnosis) {
        addToMedicalHistory("In-Patient: " + diagnosis);
    }

    @Override
    public List<String> viewRecords() {
        return getMedicalHistory();
    }
}

// OutPatient class
class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;

    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String diagnosis) {
        addToMedicalHistory("Out-Patient: " + diagnosis);
    }

    @Override
    public List<String> viewRecords() {
        return getMedicalHistory();
    }
}

// Main class
public class HospitalPatientManagement {
    public static void main(String[] args) {
        List<Patient> patients = new ArrayList<>();

        Patient p1 = new InPatient("H101", "Rohan Singh", 52, 3, 4000);
        Patient p2 = new OutPatient("H102", "Meera Rao", 28, 700);

        ((MedicalRecord) p1).addRecord("Appendix surgery");
        ((MedicalRecord) p2).addRecord("Allergy consultation");

        patients.add(p1);
        patients.add(p2);

        for (Patient patient : patients) {
            patient.getPatientDetails();
            System.out.println("Total Bill: ₹" + patient.calculateBill());
            if (patient instanceof MedicalRecord) {
                System.out.println("Medical History:");
                for (String record : ((MedicalRecord) patient).viewRecords()) {
                    System.out.println("- " + record);
                }
            }
            System.out.println("----------------------------------");
        }
    }
}
