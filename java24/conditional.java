import java.util.*;
public class conditional {

    public static void main(String[] args) {

        //leap year prblem

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year=sc.nextInt();

        if( (year%100==0) && (year%400==0) || (year%100!=0) && (year%4==0) ){
            System.out.println("Leap Year");

        }
        else{
            System.out.println("Not a leap year");
        }

  
    
}
}