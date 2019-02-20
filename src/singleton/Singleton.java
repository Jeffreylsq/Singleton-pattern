package singleton;

public class Singleton {

	public static void main(String[] args) {
		
		Aoo o1 = Aoo.getInstance();
		Aoo o2 = Aoo.getInstance();
		
		boolean result = (o1 == o2)? true : false;
		System.out.println("Are they equal? " + result);

	}

}

class Aoo
{
	private static Aoo o1 = new Aoo();
	
	private Aoo()
	{
		
	}
	
	public static Aoo getInstance()
	{
		return o1;
	}
	
}

