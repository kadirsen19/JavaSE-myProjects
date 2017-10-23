import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		
		Department departmentA = new Department(1, "Finans");
		
		departmentA.setEmployeeList(new ArrayList<Employee>());
		
		departmentA.addEmplooye(new Employee(1,"can", 10000, departmentA));
		
		departmentA.addEmplooye(new Employee(2, "kadir", 3500 , departmentA));
		
		departmentA.showEmployeeList();
	}

}
