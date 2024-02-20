public class reverse {
    public static void main(String[] args) {
    //   int number=1234;
    //   while(number>0){
    //     int lastdigit=number%10;
    //     System.out.print(lastdigit);
    //     number=number/10;

    //   }
    reverse2();

     
    }

    public static void reverse2(){
        int n=687;
        int rev=0;
        while(n>0){
            int lastdig=n%10;
            rev=(rev*10)+lastdig;
           
            n=n/10;

        }
        System.out.print(rev);

    
    }

    
    
}
