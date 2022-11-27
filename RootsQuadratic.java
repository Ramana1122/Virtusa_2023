import java.util.*;
import java.lang.Math;
public class Roots
{
  public static void main(String[] args)
  {
		    Scanner inp=new Scanner(System.in);
		    System.out.print("a= ");
		    int a=inp.nextInt();
		    System.out.print("b= ");
		    int b=inp.nextInt();
		    System.out.print("c= ");
		    int c=inp.nextInt();
		    float d=(b*b)-(4*a*c);
		    if(d<0)
		    System.out.println("Real roots does not exist");
		    else if(d>=0)
		    {
		      float r1=(-b+(float)Math.sqrt(d))/(2*a);
		      float r2=(-b-(float)Math.sqrt(d))/(2*a);
		    if(r1==r2)
		      System.out.printf("r1 & r2 = %.2f",r1);
		    else
		      System.out.printf("r1= %.2f \n r2=%.2f",r1,r2);
		    }
   }
}
