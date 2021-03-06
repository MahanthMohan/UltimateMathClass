import java.util.Scanner;

public class MaximizingThings {
static Scanner sc = new Scanner(System.in);
static double a,b,c,x1,x2,y;
static String result;

public void getInput() 
{
	System.out.println("In order to maximize the revenue you need to find the x-intercepts");
	System.out.println("Enter the coefficients a,b,c of the quadratic equation");
	System.out.println("Enter a");
	a  =  sc.nextDouble();
	System.out.println("Enter b");
	b  =  sc.nextDouble();
	System.out.println("Enter c");
	c  =  sc.nextDouble();
	result = a+"x2+"+b+"x+"+c;
	System.out.println("The quadratic formula is "+ result);
}

public void QuadraticFormula() 
{
	x1 = ((-b+Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a);
	x2 = ((-b-Math.sqrt(Math.pow(b, 2)-4*a*c))/2*a);
	System.out.println("The roots of the quadratic equation are "+ x1 +" and "+x2);
}

public void OptimalYValue()
{
	System.out.println(a*Math.pow(((x1+x2)/2),2)+b*((x1+x2)/2)+c + " is the optimal y value for revenue");
}
	public static void main(String[] args) {
		// TODO Auto-generated Method stub
	MaximizingThings calc = new MaximizingThings();
	try
	{
	    Thread.sleep(250);
	}
	catch(InterruptedException ex)
	{
	    Thread.currentThread().interrupt();
	}
	System.out.println("*** Program to Maximize Revenue ***");
		calc.getInput();
		calc.QuadraticFormula();
		System.out.println((x1+x2)/2 + " is the optimal x value for revenue");
		calc.OptimalYValue();
	}
}
