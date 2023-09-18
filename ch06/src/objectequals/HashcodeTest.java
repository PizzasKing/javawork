package objectequals;

class Employee {
	int empId;
	String empName;

	Employee(int empId, String empName) {
		this.empId = empId;
		this.empName = empName;
	}
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Employee) {
			Employee employee = (Employee)obj;
			if(empId==employee.empId)
				return true;
		}
		return super.equals(obj);
	}
	@Override
	public int hashCode() {
		return empId;
	}

}
public class HashcodeTest {

	public static void main(String[] args) {
		Employee emp1 = new Employee(101, "장그래");
		Employee emp2 = new Employee(101, "장그래");

		System.out.println(emp1 == emp2);
		System.out.println(emp1.equals(emp2));
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
		
		System.out.println(System.identityHashCode(emp1));
		System.out.println(System.identityHashCode(emp2));

	}

}
