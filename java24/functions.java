import java.util.*;
public class functions {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int a=sc.nextInt();
        // int b=sc.nextInt();

        // calsum(a, b);


       // System.out.println();
        // int a=10;
        // int b=20;
        // int temp;

        // System.out.println(a);
        // System.out.println(b);

        
        // temp=a;
        // a=b;
        // b=temp;

        // System.out.println(a);



        // System.out.println(b);

        // int a=10;
        // changeA(a);
        // System.out.println(a);
        // int product=Multiply(5,10);
        // System.out.println(product);

        
        System.out.println(BinCoeff(5,2));

       
    }

    public static void calsum(int a,int b){

        int sum=a+b;
        System.out.println(sum);

    }

    public static void swap(){
        int a=10;
        int b=20;
        int temp;

        temp=a;
        a=b;
        b=temp;
         
        


    }

    public static void changeA(int a){

         a=20;
         System.out.println(a);

    }


    public static int Multiply(int a, int b){
        int product=a*b;
        return product;
    }
    

    public static int factorial(int n){
        
        int fact=1;
        for(int i=n;i>=1;i--){
            fact=fact*i;
        }
        return fact;
        


    }

    public static int BinCoeff (int n,int r){
        int n_fact=factorial(n);
        int r_fact=factorial(r);
        int nmr=factorial(n-r);

        int bincoeff=n_fact/(r_fact*nmr) ;

        return bincoeff;

       


        
    }
}
