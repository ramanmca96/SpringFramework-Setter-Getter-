package AlphaCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentHub {

	public static void main(String[] args) {
		 ApplicationContext path = new ClassPathXmlApplicationContext("AlphaCollection/AlphaConfig.xml");
		 
		 	StudentInfo bean = (StudentInfo) path.getBean("student");
		 	
		 	System.out.println(bean.getStud_id());
		 	System.out.println(bean.getSub_marks());
		 	System.out.println(bean.getPhones());
		 	System.out.println(bean.getSubjects());
		 	System.out.println(bean.getParents());
		 	
		 	System.out.println(bean);
	}
}
