package collection.genericAssignment;

@SuppressWarnings("rawtypes")
public class T<A> implements Comparable {
	private A t;
	public T() {
		super();
		// TODO Auto-generated constructor stub
	}
	public T(A t) {
		super();
		this.t = t;
	}
	public A getT() {
		return t;
	}
    public void setT(A t) {
		this.t = t;
	}
    @Override
	public int compareTo(Object o) {
		if(this.t.equals(o))
			return 1;
		else return 0;
	}

}
