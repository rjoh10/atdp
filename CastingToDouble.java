import java.util.Scanner;

public class CastingToDouble
{
    public static void main(String[] args)
    {
        // Start here!
        Scanner input= new Scanner(System.in);
       
        int int1  =input.nextInt();
     System.out.println("First Int: "+int1);
     int int2  =input.nextInt();
     System.out.println("Second Int: "+int2);
     
     double intDivision= (double)int1/int2;
     System.out.println(intDivision);
     


    }
}