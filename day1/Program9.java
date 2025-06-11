import java.util.*;
public class Program9
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        	double fees = input.nextDouble();
        	double discountPercent = input.nextDouble();
        	double totaldiscount = (fees * discountPercent) / 100.0;
        	double finalFees = fees - totaldiscount;
        	System.out.println("the discount amount is INR"+" "+totaldiscount+""+"and final discounted fess is INR"+""+finalFees);
       
	}
}