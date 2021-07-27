package com.xworkz.market.util;


import com.xworkz.market.dto.MarketDTO;

@FunctionalInterface
public interface MarketSearch {

	boolean test(MarketDTO dto);

}

