public class Convert {
    public static void main(String[] args) {

        // bintodec(101);
        // dectobin(5);
      //  palindrome(121);

        int meal=10;
        int tip=2;
        int total=meal+ (meal>6? ++tip : --tip);
        System.out.println(total);
        
    }
    public static void bintodec(int binnum){
        int muynum=binnum;
        int pow=0;
        int dec=0;
        while(binnum>0){
            int lastdig=binnum%10;
            dec=dec+(lastdig*(int)(Math.pow(2,pow)));
            pow++;
            binnum=binnum/10;
        }

        System.out.println("The decimal value of "+muynum+" is "+dec);
    }

    public static void dectobin(int decnum){
        int mynum=decnum;
        int pow=0;
        int binnum=0;
        while(decnum>0){
            int lastdigit=decnum%2;
            binnum=binnum+lastdigit*(int)Math.pow(10,pow);
            pow++;
            decnum=decnum/2;
        }

        System.out.println("binary value of "+mynum+" is "+binnum);
    }

    public static void palindrome(int num){
        int rev=0;
        int tempnum=num;
        while(num>0){
            int lastdigit=num%10;
            rev=(rev*10)+lastdigit;
            num=num/10;
        }
        System.out.println("The reverse of "+tempnum+" is "+rev);
        if(rev==tempnum){
            System.out.println("It is a Palindrome Number");
        }
    }
}
