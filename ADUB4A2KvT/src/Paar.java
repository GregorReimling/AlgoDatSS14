
public class Paar <T>{
	private T p1;
	private T p2;
	
	public Paar(T p1, T p2) {
		this.p1=p1;
		this.p2=p2;
		
	}
	
	public T first() {
		return this.p1;
	}
	
	public T second() {
		return this.p2;
	}
	
	public void swap() {
		T tmp;
		tmp=p1;
		p1=p2;
		p2=tmp;
				
	}
	
	public String toString() {
		return "("+p1.toString() + p2.toString()+")";
	}
	

}
