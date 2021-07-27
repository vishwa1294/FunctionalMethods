package com.xworkz.Habba.dao;
import java.util.Collection;

import com.xworkz.Habba.dto.HabbaDTO;

import com.xworkz.Habba.util.*;




public interface HabbaDAO {
	
	boolean ulisu(HabbaDTO dto);

	HabbaDTO ondunaHuduku(HabbaDTO Search);

	Collection<HabbaDTO> yellavanuHuduku(HabbaDTO Search);

}


