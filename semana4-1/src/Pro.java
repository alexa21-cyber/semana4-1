import java.util.Scanner;

public class Pro {

	public static void main(String[] args) {
		double area, pi=3.1416;
		Scanner scan=new Scanner(System.in);
		System.out.println("Ingrese el radio");
		int r=scan.nextInt();
		area=pi*r*r;
		System.out.println("Area:"+area);

	}

}
