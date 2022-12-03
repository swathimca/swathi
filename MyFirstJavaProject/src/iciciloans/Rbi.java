package iciciloans;

public interface Rbi {
   
	int x = 100;
	
	public void withdraw1();
	public void deposit();
	  
	public static void main(String[] args) {
	
    //Rbi i = new Rbi;
		
		Rbi  i;
		
		i = new ICICI();
		i.withdraw1();
		i.deposit();
		
		i = new HDFC();
	    i.withdraw1();
	    i.deposit();
    
}
	
}
