package homework;

import java.util.Scanner;

public class RectangularPrism {
	
	
	
	public static void main(String[] args) {
		 
		Scanner area = new Scanner(System.in);
		   System.out.println("Length:   ");
		   double length = area.nextDouble();
		   System.out.println("Width:   ");
		   double width = area.nextDouble();
		   System.out.println("Height:    ");
		   double height = area.nextDouble();
		   double area1 = length*width*height;
		   System.out.println("Area of Rectangle is:    "+area1);

	}

}
