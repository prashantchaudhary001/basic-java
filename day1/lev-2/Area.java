import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double base = sc.nextDouble();
        double height = sc.nextDouble();
        double areaCm = 0.5 * base * height;
        double areaIn = areaCm / 6.4516;
        System.out.println("The area of the triangle in sq cm is " + areaCm + 
                           " and in sq in is " + areaIn);
    }
}
