import java.util.*;
class Multisleep extends Thread
{  
	 public void run()
{  
	  for(int i=1;i<=5;i++)
{  
	       try
                      {  
	             Thread.sleep(500);  
      	          }
                   catch(Exception e)
	       {
	          System.out.println(e);
	       }  
	  System.out.println(i);  
}  
}  
public static void main(String args[])
 {  
		Multisleep t1=new Multisleep();  
		Multisleep t2=new Multisleep();  
		Multisleep t3=new Multisleep();  
 t1.start();  
	     try
                {  
	         t1.join();  
	     }
                   catch(Exception e){
	         System.out.println(e);
	    }  
                   t2.start();  
	        t3.start();  
	 }  
}
