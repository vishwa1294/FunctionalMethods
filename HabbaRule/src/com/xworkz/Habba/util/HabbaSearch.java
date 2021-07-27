package com.xworkz.Habba.util;


	import com.xworkz.Habba.dto.HabbaDTO;

	@FunctionalInterface
	public interface HabbaSearch {

		boolean check(HabbaDTO dto);
	}

