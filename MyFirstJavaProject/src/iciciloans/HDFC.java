package iciciloans;

public class HDFC implements Rbi
{

	public static void main(String[] args) 
	{
		HDFC h = new HDFC();
		
		h.withdraw1();
		h.deposit();

	}

	@Override
	public void withdraw1() 
	{
		System.out.println("i am overriden withdrawl in HDFC");
		
	}

	@Override
	public void deposit() 
	{
		System.out.println("i am overriden deposit in HDFC");
		
	}

}
