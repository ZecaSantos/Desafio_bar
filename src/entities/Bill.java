package entities;

public class Bill {
	
	public char gender;
	
	public int beer;
	public double valBeer = 5.00;
	
	public int barbecue;
	public double valBarbecue = 7.00;
	
	public int softDrink;
	public double valSoftDrink = 3.00;
	
	public double cover = 4.00;
	
	public double ticket;	
	
		
	
	public double totBeer() {
		return beer * valBeer;
	}
	
	public double totBarbecue() {
		return barbecue * valBarbecue;
	}
	
	public double totsoftDrink() {
		return softDrink * valSoftDrink;
	}
	
	public double feeding() {
		return totBeer() + totBarbecue() + totsoftDrink();
	}
	
	
	public double total() {
		 return feeding() + cover + ticket;
	}
	
	
	
	
	
	
	
	

}
