package tw.com.fcb.StockGo;

import java.util.List;

public interface StockGoService {
	public StockGo getByCode(String code);
	
	public List<StockGo> getByname(String Name);
}
