package demopack1;

public class Demo {
	int a;
	public Demo( int a) {
		// TODO Auto-generated constructor stub
		this.a =a;
		
	}
	public static void main(String[] args) {
		System.out.println("good morning");
	}
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.a ;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		Demo d=(Demo) obj;
		boolean flag=false;
		if(this.hashCode()==d.hashCode() && this.a==d.a){
			flag= true;	
			}
		
		return flag;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		Character ch =Character.valueOf((char) (this.a + 64));
		return ch+"";
	}

}
