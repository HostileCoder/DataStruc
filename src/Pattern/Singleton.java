package Pattern;

public class Singleton {
	private static Singleton instance;
	private Singleton()
	{
		
	}

	public static synchronized Singleton getInstance()
	{
		if (instance == null)
			instance = new Singleton();

		return instance;
	}
	
	public void doSomething(){
		System.out.println("hoho");
	}
	
	
	public static void  main(String[] args){		
		 Singleton instance = Singleton.getInstance();		
		 instance.doSomething();
	}
	
	
	
}
