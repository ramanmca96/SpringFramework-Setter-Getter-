package AlphaSpringFramework;

public class EmployeeInfo {

	private int Empid;
	private String  Empname;
	private Address  Emp_address;
	
	public EmployeeInfo(int empid, String empname, Address emp_address) {
		super();
		Empid = empid;
		Empname = empname;
		Emp_address = emp_address;
	}
	@Override
	public String toString() {
		return "EmployeeInfo [Empid=" + Empid + ", Empname=" + Empname + ", Emp_address=" + Emp_address + "]";
	}
	public EmployeeInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getEmpid() {
		return Empid;
	}
	public void setEmpid(int empid) {
		Empid = empid;
	}
	public String getEmpname() {
		return Empname;
	}
	public void setEmpname(String empname) {
		Empname = empname;
	}
	public Address getEmp_address() {
		return Emp_address;
	}
	public void setEmp_address(Address emp_address) {
		Emp_address = emp_address;
	}
}
