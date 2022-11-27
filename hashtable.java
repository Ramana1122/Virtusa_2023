import java.util.*;
class Bankr
{
    public static void main(String args[])
    {
        Map<Integer,String> cust=new Hashtable<Integer,String>();
        cust.put(101,"lames");
        cust.put(102,"james");
        cust.put(103,"sames");
         System.out.println("Record are"+cust);
        cust.remove(102);
        System.out.println("after removing"+cust);
        System.out.println("size of table is: "+cust.size());
       
    }
}
