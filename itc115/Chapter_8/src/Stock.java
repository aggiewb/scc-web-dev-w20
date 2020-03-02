//An object to represent purchases of shares of stocks
public class Stock {
	private String symbol;
	private int totalShares;
	private double totalCost;
	
	//initialize a new Stock without shares purchased
	public Stock(String theSymbol) {
		if(theSymbol == null) {
			throw new NullPointerException();
		}
		symbol = theSymbol;
		totalShares = 0;
		totalCost = 0.0;
	}
	
	//return total P&L by the stock based on a given price per share
	public double getProfit(double currentPrice) {
		if(currentPrice < 0) {
			throw new IllegalArgumentException();
		}
		double marketValue = totalShares * currentPrice;
		return marketValue - totalCost;
	}
	
	public void purchase(int shares, double pricePerShare) {
		if(share < 0 || pricePerShare < 0.0) {
			throw new IllegalArgumentException();
		}
		
		totalShares += shares;
		totalCost += shares * pricePerShare;
	}

}
