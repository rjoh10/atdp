import java.util.*;

public class NightOut
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Start here!
         
        System.out.println("How much did dinner cost?");
        double dinnerCost=input.nextDouble();
        
        
        System.out.println("How much is mini-golf for one person?");
        double golfCost=input.nextDouble();

        
         System.out.println("How much did desert cost?");
         double desertCost=input.nextDouble();
         
   System.out.println("Dinner: "+dinnerCost);
   System.out.println("Mini-Golf: "+ golfCost);
   System.out.println("Desert: "+ desertCost);
   System.out.println("Grand Total:"+(dinnerCost+golfCost*2+desertCost));
   
  
         
    }
}