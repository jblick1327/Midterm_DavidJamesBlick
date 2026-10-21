package midterm;

public class SpecialistDoctor extends Doctor {
	private final String specialization;
	private final double specialistSurcharge;

	public SpecialistDoctor(String name, String phoneNumber, String department, double monthlySalary,
			double consultationFee, int patientsSeen, String specialization, double specialistSurcharge) {
		super(name, phoneNumber, department, monthlySalary, consultationFee, patientsSeen);
		this.specialization = specialization;
		this.specialistSurcharge = specialistSurcharge;
	}

	@Override
	public double calculateConsultationFee() {
		return super.calculateConsultationFee() + specialistSurcharge;
	}

	@Override
	public void displayStaffDetails() {
		super.displayStaffDetails();
		System.out.println("Specialization: " + specialization + ", Specialist Surcharge: " + specialistSurcharge);
	}

	@Override
	public String getRoleDescription() {
		return "Specialist Doctor";
	}
}
