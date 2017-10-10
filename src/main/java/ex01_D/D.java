package ex01_D;
import java.lang.StringBuffer;
 /**
  * References
  *
  */
 public class D
 {
       public static void Method1(int i, StringBuffer s)
         {
           i++; s.append("d");
         }
       public static void main(String [] args)
         {
           int i = 0;
           StringBuffer s = new StringBuffer("abc");
           Method1(i, s);
           System.out.println("i=" + i + ", s=" + s);
        }
 }
