


public class homework_four_1 {
	public static void main(String[] args) {
		Rectangle Rectangle = new Rectangle(4, 40);
		System.out.println("Width of rectangle: " + Rectangle.width + " height of rectangle: " +Rectangle.height + " area of rectangle: " +
		Rectangle.getArea());
		System.out.println("Rectangles perimter is " + Rectangle.getPerimeter());
		Rectangle Rectangle1 = new Rectangle(3.5, 35.9);
		System.out.println("width of rectangle: " + Rectangle1.width + " height of rectangle: " + Rectangle1.height + " area of rectangle: " +
		Rectangle1.getArea());
		System.out.println("Rectangles perimeter is " +
		Rectangle1.getPerimeter());
		}
	}

class Rectangle {
	double width = 1 ,height = 1;



public Rectangle(double newWidth, double newHeight) {
	width = newWidth;
	height = newHeight;
	}

public double getArea() {
	return width * height;
	}

public double getPerimeter() {
	return 2 * (width + height);
	}
	}
