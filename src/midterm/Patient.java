package midterm;

public class Patient extends Person {
	private final int patientNumber;
	private int age;
	private String medicalDepartment;
	private double consultationFee;
	private static int patientCount;

	public Patient(String name, String phoneNumber, int age, String medicalDepartment, double consultationFee) {
		super(validatePatientDetails(name, age, medicalDepartment, consultationFee), phoneNumber);
		this.patientNumber = personId;
		this.age = age;
		this.medicalDepartment = medicalDepartment;
		this.consultationFee = consultationFee;
		patientCount++;
	}

	public static int getPatientCount() {
		return patientCount;
	}

	private static String validatePatientDetails(String name, int age, String medicalDepartment, double consultationFee) {
		if (age < 0 || age > 120) {
			throw new IllegalArgumentException("Age must be between 0 and 120");
		}
		if (medicalDepartment == null || medicalDepartment.trim().isEmpty()) {
			throw new IllegalArgumentException("Medical department is required");
		}
		if (consultationFee < 0) {
			throw new IllegalArgumentException("Consultation fee must be nonnegative");
		}
		return name;
	}

	public static Patient registerPatient(String name, String phoneNumber, int age) {
		return new Patient(name, phoneNumber, age, "Unassigned", 0);
	}

	public static Patient registerPatient(String name, String phoneNumber, int age, String medicalDepartment) {
		return new Patient(name, phoneNumber, age, medicalDepartment, 0);
	}

	@Override
	public String getRoleDescription() {
		return "Patient";
	}

	public void displayPatientDetails() {
		System.out.println(super.toString() + ", Patient Number: " + patientNumber + ", Age: " + age
				+ ", Department: " + medicalDepartment + ", Consultation Fee: " + consultationFee);
	}
}
