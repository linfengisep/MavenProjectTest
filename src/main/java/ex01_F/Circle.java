package ex01_F;
import org.apache.log4j.Logger;

class Circle
{
      protected static Logger log =  Logger.getLogger(Circle.class);
         int x;
         int y;
         int radius;
      public Circle(int x, int y, int radius)
      {
        this.x = x;
        this.y = y;
        this.radius = radius;
      }
      public String toString(){
      return(String.format("Circle with center (%d,%d) and radius %d",this.x,this.y,this.radius));
      }
}
class ToStringOverLoading
{
         public static void main(String[] args)
        {
          Circle c1 = new Circle(0, 0, 5);
          Circle c2 = new Circle(0, 0, 3);
          System.out.println("C1 => "+c1);
        }
}
