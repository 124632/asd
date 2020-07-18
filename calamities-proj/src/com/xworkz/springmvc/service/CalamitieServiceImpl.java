package com.xworkz.springmvc.service;

import java.util.Objects;

import org.springframework.stereotype.Component;

import com.xworkz.springmvc.dao.CalamitieDAO;
import com.xworkz.springmvc.dto.CalamitieDTO;

@Component
public  class CalamitieServiceImpl implements CalamitieService{
	
	
	private CalamitieDAO dao;

	public CalamitieServiceImpl() {
		System.out.println("created"+this.getClass().getSimpleName());
	}

	public int createAndValidate(CalamitieDTO dto) {
		System.out.println("invoked createAndValidate method in CalamitieServiceImpl " + dto);
		/* for valid=0 & for invalid=1 */
		int valid = 1;
		try {
			if (Objects.nonNull(dto)) {
				System.out.println("CalamitieDTO not null can save");
				if (dto.getPlace() != null) {
					System.out.println("CalamitieDTO place not null can save");
					valid = 0;

				} else {
					System.out.println("CalamitieDTO place is null can't save");
				}
				if (dto.getDate() != null) {
					System.out.println("CalamitieDTO date not null can save");
					valid = 0;

				} else {
					System.out.println("CalamitieDTO date is null can't save");
				}
				if (dto.getCalamityType() != null) {
					System.out.println("CalamitieDTO CalamityType not null can save");
					valid = 0;

				} else {
					System.out.println("CalamitieDTO CalamityType is null can't save");
				}
				if (valid == 0) {
					System.out.println("CalamitieDTO is valid can save it..");
					dao.create(dto);	  
				} else {
					System.out.println("CalamitieDTO not valid can't save it..");
				}

			} else {
				System.out.println("CalamitieDTO is null can't save");

			}
		} catch (Exception e) {
			System.err.println("Exception in createAndValidate in CalamitieServiceImpl" + e.getMessage());
		}
		return 0;
	}

	
}
