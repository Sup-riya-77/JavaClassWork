package assignment;
import java.util.List;
import java.util.Vector;
/**
* Supports arithmetic operations of +, -, *, / on any type that are subclasses
* of {@link java.lang.Number}.
* @author pchandra
*
*/
public class ArithmeticOperations
{
/**
* Generic method to add 2 numbers.
* @param t1
* @param t2
* @return
*/
	public static <T extends Number> Number add(T t1, T t2)
	{
		return (t1.doubleValue() + t2.doubleValue());
	}
	
	public static <T extends Number> Number sub(T t1, T t2)
	{
		return (t1.doubleValue() - t2.doubleValue());
	}
	
	public static <T extends Number> Number div(T t1, T t2)
	{
		return (t1.doubleValue() / t2.doubleValue());
	}
	/**
	 * Demostrates Upper Bounded Wildcards.
	 * Generic method to add numbers from a list.
	 * @param t1
	 * @param t2
	 * @return
	 */
	public static <T extends Number> Number add(List<? extends Number> list)
	{
		double d = 0;;
		for (int i = 0; i < list.size(); i++)
			d += list.get(i).doubleValue();
	
		return d;
	}
	public static <T extends Number> Number sub(List<? extends Number> list)
	{
		double d = list.get(0).doubleValue();
		for (int i = 1; i < list.size(); i++)
			d-= list.get(i).doubleValue();
	
		return  d;
	}
	public static <T extends Number> Number div(List<? extends Number> list)
	{
		double d = list.get(0).doubleValue();
		for (int i = 1; i < list.size(); i++)
			d/=list.get(i).doubleValue();
	
		return  d;
	}
	
	
	/**
	 * Demostrates Unbounded Wildcards.
	 * Generic method to dump list data to console.
	 * @param t1
	 * @param t2
	 * @return
	 */
	public static void dumpList(List<?> list)
	{
		System.out.println("List dump with unbounded wildcard:");
		for (int i = 0; i < list.size(); i++)
			System.out.println(list.get(i));
	}
	public static void main(String[] args)
	{
		Vector<Number> l = new Vector<Number>();
		l.add(90);
		l.add(30);
		// Dumping the list to the console.
				ArithmeticOperations.dumpList(l);
				
				
		// Adding 2 integers
		Integer i1 = 34, i2 = 43;
		System.out.println("Add with generic method: " + ArithmeticOperations.add(i1, i2));
		Float f1 = 12.56f, f2 = 3.6778f;
		System.out.println("Add with generic method: " + ArithmeticOperations.add(f1, f2));
		
	    // Adding 2 integers through a list
		
		System.out.println("Add with upper bounded wildcard: " + ArithmeticOperations.add(l));
	
	     // Subtracting 2 Integers
		System.out.println("Sub with generic method: " + ArithmeticOperations.sub(i1, i2));
		System.out.println("Sub with generic method: " + ArithmeticOperations.sub(f1, f2));
		// Subtracting 2 integers through a list
		System.out.println("Sub with upper bounded wildcard: " + ArithmeticOperations.sub(l));
		
		// Dividing 2 Integers
		System.out.println("Div with generic method: " + ArithmeticOperations.div(i1, i2));
		System.out.println("Div with generic method: " + ArithmeticOperations.div(f1, f2));
		// Dividing 2 integers through a list
		System.out.println("Div with upper bounded wildcard: " + ArithmeticOperations.div(l));

		
	 }
}