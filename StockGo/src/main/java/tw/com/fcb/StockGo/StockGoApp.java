package tw.com.fcb.StockGo;

public class StockGoApp 
{
    public static void main(String[] args)
    {
    	StockGoServiceImpl s = new StockGoServiceImpl();
    	System.out.println("name = " + s.getByCode("2330"));
    }
}
