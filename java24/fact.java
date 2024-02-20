import java.util.*;
public class fact {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int fact=1;

        // for(int i=1;i<=n;i++){
        //     fact=fact*i;
        // }
        // System.out.println("fact is "+fact);

        fact obj=new fact();
        obj.mul(5);
    }

    public void mul(int num){

        for(int i=1;i<=10;i++){
            System.out.println(num+"x"+i+"="+num*i);
        }
        
    }
    
}
