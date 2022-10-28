package javademo;

public class encap {

	public static void main(String[] args) {
		employee e = new employee();
		e.setName("Belinda");
		e.setSalary(100000);
		System.out.println("Name: "+e.getName());
		System.out.println("Salary: "+e.getSalary());

	}

}
