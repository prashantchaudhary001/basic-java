import java.util.*;
public class Program6
{
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
        double fee = 125000;
        double discountPercent = 10;
        double discount = (fee * discountPercent) / 100;
        double finalFees = fee - discount;
        System.out.println(discount);
        System.out.println(finalFees);
	}
}