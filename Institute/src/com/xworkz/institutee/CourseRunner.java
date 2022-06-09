package com.xworkz.institutee;

import java.time.LocalDate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.xworkz.institute.dao.CourseDAO;
import com.xworkz.institute.dao.CourseDAOImpl;
import com.xworkz.institute.dto.CourseDTO;
import com.xworkz.institute.service.CourseService;
import com.xworkz.institute.service.CourseServiceImpl;

public class CourseRunner {
	public static void main(String[] args) {
	
		CourseDTO dto1 = new CourseDTO(1, "Java", 3, 26000, LocalDate.of(2022, 1, 11), true);
		CourseDTO dto2 = new CourseDTO(2, "MySQL", 4, 6000, LocalDate.of(2022, 3, 12), true);
		CourseDTO dto3 = new CourseDTO(3, "Web", 5, 7000, LocalDate.of(2022, 5, 5), false);
		CourseDTO dto4 = new CourseDTO(4, "Spring", 2, 10000, LocalDate.of(2022, 5, 20), true);
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Resources/SpringInstitute.xml");
		CourseService csi = applicationContext.getBean(CourseService.class);
		csi.validate(dto1);
	}
}
