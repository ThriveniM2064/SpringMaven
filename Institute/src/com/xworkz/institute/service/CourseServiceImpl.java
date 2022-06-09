package com.xworkz.institute.service;

import java.time.LocalDate;
import com.xworkz.institute.dao.CourseDAO;
import com.xworkz.institute.dto.CourseDTO;

public class CourseServiceImpl implements CourseService {
	private CourseDAO dao;

	public CourseServiceImpl(CourseDAO dao) {
		this.dao = dao;
	}

	@Override
	public boolean validate(CourseDTO dto) {
		if (dto != null) {
			System.out.println("not null");
			if (dto.getId() > 0) {
				System.out.println("entered id is greater than zero");
			} else {
				System.out.println("entered id is less than zero");
			}
			if (dto.getName() != null && !dto.getName().isEmpty() && dto.getName().length() >= 4
					&& dto.getName().length() < 30) {
				System.out.println("name is valid");
			} else {
				System.out.println("name is null");
			}
			if (dto.getDuration() < 6 && dto.getDuration() > 0) {
				System.out.println("course duration is valid");
			}
			if (dto.getStartdate().isAfter(LocalDate.of(2020, 11, 18))) {
				System.out.println("start date is valid");
			} else {
				System.out.println("start date is in valid");
				return false;
			}
			boolean ref = dao.save(dto);
			System.out.println(ref);
			System.out.println("saving the data to DataBase of " + dto);
		} else {
			System.out.println("dto is null");
		}
		return false;
	}

}
