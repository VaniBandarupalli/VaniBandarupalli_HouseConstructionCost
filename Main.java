package cleancode;
import java.util.*;
class House
{
  int e;
     static void cost(String s,int a)
    {
      if(s=="standard")
       System.out.println(1200*a);
      else if(s=="above standard")
    	       System.out.println(1500*a);
      else if(s=="high standard")
    	  System.out.println(1800*a);
      else
    	  System.out.println(2500*a);
    }
    
}
public class Main
{
  static
  {
    Scanner s=new Scanner(System.in);
    int a=s.nextInt();
    String m=s.next();
    House h=new House();
    h.cost(m,a);
  }
public static void main (String[] args) 
  {
  }
  
}
