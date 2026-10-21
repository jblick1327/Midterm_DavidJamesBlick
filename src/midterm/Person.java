package midterm;

public abstract class Person {
	protected final int personId;
	protected String name;
	protected String phoneNumber;
	private static int personCount;

	public Person(String name, String phoneNumber) {
		if (name == null || name.trim().isEmpty() || phoneNumber == null || phoneNumber.trim().isEmpty()) {
			throw new IllegalArgumentException("Name and phone number are required");
		}
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.personId = registerPerson();
	}

	private static int registerPerson() {
		return ++personCount;
	}

	public static int getPersonCount() {
		return personCount;
	}

	public void displayBasicDetails() {
		System.out.println(this);
	}

	public abstract String getRoleDescription();

	@Override
	public String toString() {
		return "Person ID: " + personId + ", Name: " + name + ", Phone: " + phoneNumber;
	}
}
