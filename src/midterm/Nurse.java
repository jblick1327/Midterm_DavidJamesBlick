package midterm;

public class Nurse extends MedicalStaff {
	private final String shiftType;
	private final double shiftAllowance;

	public Nurse(String name, String phoneNumber, String department, double monthlySalary,
			String shiftType, double shiftAllowance) {
		super(name, phoneNumber, department, monthlySalary);
		this.shiftType = shiftType;
		this.shiftAllowance = shiftAllowance;
	}

	@Override
	public double calculateMonthlyCompensation() {
		return monthlySalary + shiftAllowance;
	}

	@Override
	public void displayStaffDetails() {
		super.displayStaffDetails();
		System.out.println("Role: " + getRoleDescription() + ", Shift: " + shiftType
				+ ", Shift Allowance: " + shiftAllowance);
	}

	@Override
	public String getRoleDescription() {
		return "Nurse";
	}
}
