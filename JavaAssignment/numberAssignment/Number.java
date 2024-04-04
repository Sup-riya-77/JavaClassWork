package numberAssignment;

public class Number {
	private int x;
	
	public Number() {
		super();
	}
	public Number(int x) {
		super();
		this.x = x;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	
	public Boolean checkPrime(int x)
	{
		int count=0;
		for(int i=2;i<x;i++)		
		{
			if(x%i==0) count++;
		}
		if(count==0) return true;
		else return false;
		
		
	}
	
	public Boolean checkAmstrong(int x)
	{
		int sum=0;
		int remainder;
		int number=x;
		int n=0;
		while(x!=0)
		{
			x=x/10;
			n++;
		}
		x=number;
		while(x!=0)
		{
			remainder=x%10;
			sum=(int) (sum+Math.pow(remainder, n));
			x=x/10;
		}
		if(sum==number) return true;
		else return false;
	}
	
	
	public Boolean CheckPolindrom(int x)
	{
		int reverseNum=0;
		int number=x;
		while(x!=0)
		{
		int remainder=x%10;
		reverseNum=reverseNum*10+remainder;
		x=x/10;
		}
		if(reverseNum==number) return true;
		else return false;
		
	}
	

}
