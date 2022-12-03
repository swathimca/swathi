package iciciloans;

public abstract class FirstAbstract
{
	int X =100;
	
	public void m1()
	    {
	
	System.out.println("iam m1 concrete from FirstAbstract");
	    
	    }

		
    public abstract void m2();
    
    public static void main(String[] args) 
    {
		//FirstAbstract obj = new FirstAbstract();
    	
    	FirstAbstract obj = new ChildClass();
    	obj.m1();
    	obj.m2();
    	
	}
    
    
}