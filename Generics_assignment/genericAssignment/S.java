package collection.genericAssignment;

@SuppressWarnings("rawtypes")
public class S<B> implements Comparable{
	private B s;
	public S() {
		super();
		// TODO Auto-generated constructor stub
	}
	public S(B s) {
		super();
		this.s = s;
	}
	
    public B getS() {
		return s;
	}
	public void setS(B s) {
		this.s = s;
	}
	@Override
	public int compareTo(Object o) {
		if(this.s.equals(o))return 0;
		else return 0;
	}

}
