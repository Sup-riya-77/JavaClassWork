package numberAssignment;
import java.util.Scanner;
public class NumberDemo {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		Number number=new Number();
		System.out.println("Enter Number : ");
		number.setX(scan.nextInt());
		scan.close();
		Boolean isPrime=number.checkPrime(number.getX());
		if(isPrime) System.out.println(number.getX()+" is Prime number");
		else System.out.println(number.getX()+" is not Prime number");
		
		Boolean isAmstrong=number.checkAmstrong(number.getX());
		if(isAmstrong) System.out.println(number.getX()+" is Amstrong number");
		else System.out.println(number.getX()+" is not Amstrong number");
		
		Boolean isPalindrome=number.CheckPolindrom(number.getX());
		if(isPalindrome) System.out.println(number.getX()+" is Pallindrom number");
		else System.out.println(number.getX()+" is not  Pallindrom number");

	}

}
