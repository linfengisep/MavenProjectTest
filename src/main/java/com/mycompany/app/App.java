package com.mycompany.app;
/**
 * Hello world!
 *
 */
public class App
{
    public static void main( String[] args )
    {
         System.out.println( "Hello World!" );
        if (args.length >0)
        {
          for (String argument : args){
               int i=0;
               System.out.println("argument ["+i+"] is:"+argument);
               i++;
            }
        }
     }
}
