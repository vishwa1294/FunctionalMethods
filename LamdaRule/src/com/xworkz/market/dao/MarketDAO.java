
package com.xworkz.market.dao;

import java.util.Collection;

import com.xworkz.market.dto.MarketDTO;
import com.xworkz.market.util.MarketSearch;

public interface MarketDAO {

	MarketDTO findby(MarketSearch marketSearch);

	Collection<MarketDTO> findAll(MarketSearch marketSearch);

}
