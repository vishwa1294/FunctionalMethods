package com.xworkz.Habba;

import java.util.Arrays;
import java.util.Collection;

import com.xworkz.Habba.constant.Religion;
import com.xworkz.Habba.dao.HabbaDAO;
import com.xworkz.Habba.dao.HabbaDAOImpl;
import com.xworkz.Habba.dto.HabbaDTO;

public class HabbaTester {

	public static void main(String[] args) {

		HabbaDTO dto1 = new HabbaDTO("Deepavali", "All Over India", 5, Religion.HINDU, "Laddu", true, true);
		HabbaDTO dto2 = new HabbaDTO("Holi", "Karnataka", 2, Religion.HINDU, "Holige", false, false);
		HabbaDTO dto3 = new HabbaDTO("Sankranti", "India and Maharshtra",1 , Religion.HINDU, "Sajjirotti", false, true);
		HabbaDTO dto4 = new HabbaDTO("Ramzan", "India", 1, Religion.MUSLIMs, "Surkurma", false, false);
		HabbaDTO dto5 = new HabbaDTO("Ganesh chaturthi", "India", 11, Religion.HINDU, "Modak", true, true);

		HabbaDAO dao = new HabbaDAOImpl();
		dao.ulisu(dto4);
		dao.ulisu(dto5);
		dao.ulisu(dto3);
		dao.ulisu(dto2);
		dao.ulisu(dto1);

		Collection<HabbaDTO> HabbaCollection = Arrays.asList(dto1, dto2, dto3, dto4, dto5);

		System.out.println("-------------------------------");
		HabbaCollection.forEach((element) -> System.out.println(element.getName().toUpperCase()));
		System.out.println("-------------------------------");

		HabbaCollection.forEach((element) -> System.out.println(element.getSpecialFood()));
		System.out.println("-------------------------------");
		
		HabbaCollection.forEach((element) ->{
			if(element.getName().equals("Holi"))
			{
				System.out.println(element);
			}
		});
		
		System.out.println("-------------------------------");
		
		HabbaCollection.forEach((element) ->{
			if(element.getReligion().equals(Religion.HINDU))
			{
				System.out.println(element);
			}
		});
	}


}
