package iciciloans;

public class ICICI implements Rbi
{

	public static void main(String[] args) 
	{
	   ICICI i= new ICICI();
	   
	    i.deposit();
	    i.withdraw1();
		  
	}

	@Override
	public void withdraw1() 
	    { 
		System.out.println("i am overriden withdrawl in ICICI");
		
		}

	@Override
	public void deposit() 
	{
	    System.out.println("i am overriden deposit in ICICI");
		
	}

}
