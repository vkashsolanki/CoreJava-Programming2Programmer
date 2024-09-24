package superuse;

public class Dogs extends Animals{
	
	
	
	
	Dogs()
	{
		super();
		System.out.println(super.count);
		System.out.println(super.color);
		
		System.out.println(super.name);
		super.eat();
		super.run();
		
	}
	
	Dogs(int i, String c, String n){
		super();
		this.count=i;
		this.color=c;	
		this.name=n;
		
		
	}
	
	
	
	
	public static void main(String[] args) {
		
		Dogs ds= new Dogs();
		Dogs d= new Dogs(12,"ram","Per");
		
		
		
		
	}
	

}
