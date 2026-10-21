package midterm;

public class Main {
	public static void main(String[] args) {
		System.out.println("=== Patient registration ===");
		Patient firstPatient = Patient.registerPatient("Alice N. Wunderlan", "416-123-0101", 32);
		Patient secondPatient = Patient.registerPatient("Bob Loblaw", "647-555-0123", 45, "Cardiology");
		System.out.println("Registration successful: " + firstPatient.name);
		System.out.println("Registration successful: " + secondPatient.name);
		try {
			Patient.registerPatient("Invalid Patient", "555-0103", -1);
		} catch (IllegalArgumentException error) {
			System.out.println("Registration failed: " + error.getMessage());
		}
		firstPatient.displayPatientDetails();
		secondPatient.displayPatientDetails();

		Doctor doctor = new Doctor("Real Personne", "123-456-7890", "General Medicine", 6000, 100, 20);
		SpecialistDoctor specialistDoctor = new SpecialistDoctor("Ben Ari", "010-101-0101", "Cardiology",
				8000, 150, 15, "Heart Care", 50);
		Nurse nurse = new Nurse("Frank Sredhotsoz", "647-989-2334", "Emergency", 4000, "Night", 500);

		System.out.println("\n=== Staff - runtime polymorphism ===");
		MedicalStaff[] staffMembers = {doctor, specialistDoctor, nurse};
		for (MedicalStaff staffMember : staffMembers) {
			staffMember.displayStaffDetails();
			System.out.println("Monthly compensation: $" + staffMember.calculateMonthlyCompensation());
		}

		System.out.println("\n=== Consultation fees ===");
		System.out.println("Standard fee: $" + doctor.calculateConsultationFee());
		System.out.println("Fee with 10% discount: $" + doctor.calculateConsultationFee(0.10));
		System.out.println("Fee with discount and $20 charge: $" + doctor.calculateConsultationFee(0.10, 20));
		System.out.println("Specialist fee: $" + specialistDoctor.calculateConsultationFee());

		System.out.println("\n=== Interfaces ===");
		Reportable reportableDoctor = specialistDoctor;
		Schedulable schedulableDoctor = specialistDoctor;
		reportableDoctor.generateReport();
		schedulableDoctor.scheduleAppointment("Next Monday");
		schedulableDoctor.scheduleAppointment("");

		System.out.println("\n=== Static counts ===");
		System.out.println("People: " + Person.getPersonCount());
		System.out.println("Patients: " + Patient.getPatientCount());
		System.out.println("Staff: " + MedicalStaff.getStaffCount());

	}
}
