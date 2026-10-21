package midterm;

public abstract class MedicalStaff extends Person {
	protected final int staffId;
	protected String department;
	protected double monthlySalary;
	private static int staffCount;

	public MedicalStaff(String name, String phoneNumber, String department, double monthlySalary) {
		super(name, phoneNumber);
		this.staffId = personId;
		this.department = department;
		this.monthlySalary = monthlySalary;
		staffCount++;
	}

	public static int getStaffCount() {
		return staffCount;
	}

	public abstract double calculateMonthlyCompensation();

	public void displayStaffDetails() {
		System.out.println(super.toString() + ", Staff ID: " + staffId + ", Department: " + department
				+ ", Monthly Salary: " + monthlySalary);
	}

	@Override
	public String getRoleDescription() {
		return "Medical Staff";
	}
}
