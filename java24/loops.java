import java.util.*;
public class loops {
    public static void main( String args[]){

        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int sum=0;
        // int i=1;
        // while(i<=n){
        //     sum=sum+i;
        //     i++;
      //  star();
        invert();
        }
       // System.out.println(sum);
        

        

        
    
    public static void star(){
        for(int i=0;i<=3;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
          
        }
        
    }

    public static void invert(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        
             
    }

    
}
