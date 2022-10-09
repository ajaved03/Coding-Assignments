
import java.util.*;
import java.math.*;

public class homework_four_4 {
	public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        QuadraticEquation e = new QuadraticEquation(a, b, c);
        double d = e.getDiscriminant();

        if (d > 0) {
            System.out.println("The first root is " + e.getRoot1() + " and the second root is " + e.getRoot2());
        } else if (d == 0) {
            System.out.println("The only root is " + e.getRoot1());
        } else {
            System.out.println("There are no roots");

        }
        input.close();
    }

}

class QuadraticEquation {

     double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
         return Math.pow( b , b) - (4 * a * c);
    }

    public double getRoot1() {
            return  (-b + Math.pow(getDiscriminant(), 0.5)) / (2 * a);
    }

    public double getRoot2() {
            return  (-b - Math.pow(getDiscriminant(), 0.5)) / (2 * a);
    }

}
/*
  a: double
  b: double
  c: double
  d :double
  
  +getA()
  +setA(a)
  +getB()
  +setB(b)
  +getC()
  +setC(c)
  +getDiscriminant()
  +getRoot1()
  +getRoot2()
 */
