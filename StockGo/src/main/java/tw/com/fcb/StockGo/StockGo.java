package tw.com.fcb.StockGo;

public class StockGo {
	private String Name;
	private String code;
	private int price;
	
	
	@Override
	public String toString() {
		return "StockGo [Name=" + Name + ", code=" + code + ", price=" + price + "]";
	}
	
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}

	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
