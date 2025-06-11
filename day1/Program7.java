import java.util.*;
public class Program7
{
	public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
        double radius = 6378;
        double volumeInKm = (4.0 / 3.0) * 3.14 * Math.pow(radius, 3);
        double volumeInMiles = volumeInKm / Math.pow(1.6, 3);
         System.out.println("The volume of earth in cubic Km is"+""+volumeInKm+"and cubic miles is"+""+volumeInMiles);
	}
}