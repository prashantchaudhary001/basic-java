import java.util.*;
public class Program10
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
        	double cm = input.nextDouble();
        	double totalInches = cm / 2.54;
        	int feet = (int)(cm / 12);
        	double inches = totalInches % 12;
        	System.out.println("your height in cm is"+""+cm+""+"while in feet is"+""+feet+""+"and inches is"+""+inches);
       
	}
}