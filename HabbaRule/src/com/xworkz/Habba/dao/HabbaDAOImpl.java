package com.xworkz.Habba.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Arrays;



import com.xworkz.Habba.util.HabbaSearch;

import com.xworkz.Habba.dto.HabbaDTO;
import com.xworkz.Habba.constant.*;


public class HabbaDAOImpl implements HabbaDAO {

	
	
	private Collection<HabbaDTO> collection = new ArrayList<>();

	public HabbaDAOImpl() {

		
	}

	@Override
	public boolean ulisu(HabbaDTO dto) {
		boolean added = collection.add(dto);
		System.out.println("dto " + dto);
		System.out.println("dto was added " + added);
		return added;
	}

	@Override
	public HabbaDTO ondunaHuduku(HabbaDTO Search) {
		collection.forEach((a)-> System.out.println(a));;
		return Search;

	}

	@Override
	public Collection<HabbaDTO> yellavanuHuduku(HabbaDTO Search) {
		collection.forEach((a)->System.out.println(a));
		return collection;
	}

}


