package AlphaSpringFramework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("AlphaSpringFramework/AlphaConfig.xml");

		EmployeeInfo bean = (EmployeeInfo) con.getBean("Emp1");
		System.out.println(bean.getEmpid());
		System.out.println(bean.getEmpname());
		System.out.println(bean.getEmp_address().getStreet());
		System.out.println(bean.getEmp_address().getPincode());
		System.out.println(bean.getEmp_address().getCity());
		System.out.println(bean);
	}
}
