package midterm;

public class Doctor extends MedicalStaff implements Reportable, Schedulable {
	private final double consultationFee;
	private int patientsSeen;

	public Doctor(String name, String phoneNumber, String department, double monthlySalary,
			double consultationFee, int patientsSeen) {
		super(name, phoneNumber, department, monthlySalary);
		this.consultationFee = consultationFee;
		this.patientsSeen = patientsSeen;
	}

	@Override
	public double calculateMonthlyCompensation() {
		double performanceAllowance = patientsSeen * consultationFee;
		return monthlySalary + performanceAllowance;
	}

	@Override
	public void displayStaffDetails() {
		super.displayStaffDetails();
		System.out.println("Role: " + getRoleDescription() + ", Consultation Fee: " + consultationFee
				+ ", Patients Seen: " + patientsSeen);
	}

	@Override
	public String getRoleDescription() {
		return "Doctor";
	}

	public double calculateConsultationFee() {
		return consultationFee;
	}

	public double calculateConsultationFee(double discount) {
		return calculateConsultationFee() * (1 - discount);
	}

	public double calculateConsultationFee(double discount, double additionalCharge) {
		return calculateConsultationFee(discount) + additionalCharge;
	}

	@Override
	public void generateReport() {
		System.out.println(getRoleDescription() + " report for " + name + ": " + patientsSeen + " patients seen.");
	}

	@Override
	public void scheduleAppointment(String appointmentDate) {
		if (appointmentDate == null || appointmentDate.trim().isEmpty()) {
			System.out.println("Appointment scheduling failed: date is required.");
			return;
		}
		System.out.println("Appointment scheduled with " + name + " on " + appointmentDate + ".");
	}
}
