
package com.xworkz.market.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.xworkz.market.dto.MarketDTO;
import com.xworkz.market.util.MarketSearch;

public class MarketDAOImpl implements MarketDAO {

	private Collection<MarketDTO> collection = new ArrayList<>();

	public MarketDAOImpl() {
		MarketDTO dto1 = new MarketDTO("K R market", "Bangalore", "all type", 300);
		MarketDTO dto2 = new MarketDTO("Pooja market", "Shivamogga", "flower type", 100);
		MarketDTO dto3 = new MarketDTO(" market", "jkd", "flower and fruit type", 200);
		MarketDTO dto4 = new MarketDTO("santa market", "Honnali", "Vegetable type", 150);
		MarketDTO dto5 = new MarketDTO("Commercial Street", "Mysore", "Antique type", 120);

		this.collection.add(dto5);
		this.collection.add(dto4);
		this.collection.add(dto3);
		this.collection.add(dto2);
		this.collection.add(dto1);

	}

	@Override
	public MarketDTO findby(MarketSearch marketSearch) {

		Iterator<MarketDTO> itr = this.collection.iterator();
		MarketDTO temp = null;
		while (itr.hasNext()) {
			MarketDTO marketDTO = itr.next();
			if (marketSearch.test(marketDTO)) {
				temp = marketDTO;
				break;
			}
		}
		return temp;
	}

	@Override
	public Collection<MarketDTO> findAll(MarketSearch marketSearch) {
		Collection<MarketDTO> temp = new ArrayList<>();
		Iterator<MarketDTO> itr = this.collection.iterator();
		while (itr.hasNext()) {
			MarketDTO marketDTO = itr.next();
			if (marketSearch.test(marketDTO)) {
				temp.add(marketDTO);
			}
		}
		return temp;
	}

}
