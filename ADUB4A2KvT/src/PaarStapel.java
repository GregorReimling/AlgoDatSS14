
public class PaarStapel <T>{
	
	
	private Stapel<T> s1;
	private Stapel<T> s2;
	
	public PaarStapel(Stapel <T> s1, Stapel <T> s2) {
		this.s1=s1;
		this.s2=s2;
	}
	
	public void push(Paar<T>p) {
		s1.push(p.first());
		s2.push(p.second());
		
	}
	
	public Paar <T> pop () {
		return new Paar<T>(s1.pop(),s2.pop());
		
	}
	
	public Paar <T> peek() {
		return new Paar<T>(s1.peek(), s2.peek());
	}
	
}
