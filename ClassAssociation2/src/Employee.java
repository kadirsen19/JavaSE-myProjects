
public class Employee {

	private long employeeId;
	private String employeeName;
	private double employeeSalary;
	private Department department;

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Employee(long employeeId, String employeeName, double employeeSalary, Department department) {

		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.department = department;
	}

	@Override
	public String toString() {
		return  " Id--> "+getEmployeeId()+" " 
				+"Ad: "+getEmployeeName()
				+"Salary : "+getEmployeeSalary()
				+"Department "+getDepartment().getDepartmentName();
	}

	public long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(long employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getEmployeeSalary() {
		return employeeSalary;
	}

	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
}
