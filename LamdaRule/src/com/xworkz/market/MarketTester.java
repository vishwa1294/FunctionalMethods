package com.xworkz.market;




import java.util.Collection;

import com.xworkz.market.dao.MarketDAO;
import com.xworkz.market.dao.MarketDAOImpl;
import com.xworkz.market.dto.MarketDTO;

public class MarketTester {

	public static void main(String[] args) {

		MarketDAO dao = new MarketDAOImpl();

		MarketDTO found = dao.findby((a) -> a.getName().equals(" market"));
		System.out.println(found);
		System.out.println("-------------------------------");

		found = dao.findby((b) -> b.getLocation().equals("Honnali"));
		System.out.println(found);
		System.out.println("-------------------------------");

		found = dao.findby((c) -> c.getMarketType().equals("flower type"));
		System.out.println(found);
		System.out.println("-------------------------------");

		found = dao.findby((d) -> d.getNoOfShops() > 250);
		System.out.println(found);
		System.out.println("-------------------------------");

		Collection<MarketDTO> all = dao.findAll((dto) -> dto.getLocation().equals("Shivamogga"));
		for (MarketDTO marketDTO : all) {
			System.out.println(marketDTO);
		}
		System.out.println("-------------------------------");

		all = dao.findAll((dto) -> dto.getNoOfShops() > 100);
		for (MarketDTO marketDTO : all) {
			System.out.println(marketDTO);
		}
		System.out.println("-------------------------------");

	}

}
