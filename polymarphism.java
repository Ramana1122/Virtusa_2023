import java.util.*;
class overload
{
  void area(float x)
   {
	System.out.println("The area of square is "+Math.pow(x,2)+"sq.units");
   }
  void area(float x , float y)
   {
	System.out.println("The area of Rectangle is "+x*y+"sq.units");
   }
  void area1(double r)
   {
	double z=3.14*r*r;
	System.out.println("The area of circle "+z+"sq.units");
   }
}
class Polymorphism
{
  public static void main(String[] args)
   {
     overload s=new overload();
     s.area(5);
     s.area(5,6);
     s.area1(5);
   }
}
