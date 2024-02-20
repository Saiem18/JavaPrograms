//Multiple functions with same name but diiferent parameters
public class Overloading {
    public static void main(String[] args) {

        // int a=10;
        // float b=0.1f;

        // System.out.println(a*b);

        // Mul(5,5);
        boolean prime=true;
        int n=13;
        for(int i=2;i<n;i++){
            if(n%i==0){
                System.out.println("Not Prime");
                break;

              

             
            }
            else{
                System.out.println("prime");
                break;
            }
         
          
          
        }

        
    }

    public static void Mul(int n, float m){
        System.out.println(n*m);
    }

    public static void Mul2(double a,double b){
        System.out.println(a*b);
    }

    public static void Mul3(int a,int b ,int c){
        System.out.println(a*b*c);
    }


    
}
