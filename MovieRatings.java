import java.util.Scanner;

public class MovieRatings
{
    public static void main(String[] args)
    {
        // Start here!
        System.out.println("Enter movie rating(as a decimal)");
       Scanner input= new Scanner(System.in);
       
        double movieRating  =input.nextDouble();
        int rounded1=(int)(movieRating+0.5);
        System.out.println("Rating rounded:"+rounded1);
    
    }
}