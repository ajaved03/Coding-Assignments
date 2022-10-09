


public class homework_four_2 {
	public static void main(String[] args) {
		
		Stock stock = new Stock("ORCL", "Oracle Corporation");
		stock.previousClosingPrice = 34.5;
		stock.currentPrice = 34.35;
		System.out.println();

		System.out.println("Stock name: " + stock.name+"\nStock symbol: " + stock.symbol);
		System.out.println("Price-change percentage: "+stock.getChangePercent());
	}

}
 class Stock {

     String symbol, name;

     double previousClosingPrice,currentPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        this.previousClosingPrice = this.currentPrice;
        this.currentPrice = currentPrice;
    }

    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }

    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }

    public double getChangePercent() {
    	double change;
    	change=((currentPrice-previousClosingPrice)/ previousClosingPrice) *100;
        return change;
    }
}
 /*  
  -symbol: String
  -name: String
  -previousClosingPrice: double
  -currentPrice: double
  -change: double
  
  +getSymbol()
  +setSymbol(String symbol)
  +getName()
  +setName(String name)
  +getCurrentPrice()
  +setCurrentPrice(int currentPrice)
  +getPreviousClosingPrice()
  +setPreviousClosingPrice(previousClosingPrice)
  + getChangePercent()
  
  */   
  