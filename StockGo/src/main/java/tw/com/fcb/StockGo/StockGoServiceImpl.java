package tw.com.fcb.StockGo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StockGoServiceImpl implements StockGoService {
	Map<String, StockGo> StockGos = new HashMap<String, StockGo>();

	public StockGoServiceImpl() {
		StockGo StockGo1 = new StockGo();
		StockGo1.setCode("2330");
		StockGo1.setName("台積電");
		StockGo1.setPrice(650);
		
		StockGo StockGo2 = new StockGo();
		StockGo2.setCode("2303");
		StockGo2.setName("聯電");
		StockGo2.setPrice(60);
		
		StockGo StockGo3 = new StockGo();
		StockGo3.setCode("2317");
		StockGo3.setName("鴻海");
		StockGo3.setPrice(100);
		
		StockGos.put(StockGo1.getCode(), StockGo1);
		StockGos.put(StockGo2.getCode(), StockGo2);
		StockGos.put(StockGo3.getCode(), StockGo3);
	}

	@Override
	public StockGo getByCode(String code) {
		return StockGos.get(code);
	}

	@Override
	public List<StockGo> getByname(String stockName) {
		List<StockGo> result = new ArrayList<StockGo>();

		for (String key : StockGos.keySet()) {
			StockGo thisStockGo = StockGos.get(key);

			if (thisStockGo.getName().equals(stockName)) {
				result.add(thisStockGo);
			} else {
				System.out.println("no add ");
			}
		}
		return result;
	}

}
