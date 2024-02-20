public class Subarrays{
    public static void main(String[] args) {
        int num[]={1,2,3,4};
        Pair(num);

        int numbers[]={1,-2,6,-1,3};
      //  Sub2(numbers);

       Maxsub(numbers);
      




    }
    public static void Pair(int num[]){
      //  int perm=num[0];

        for(int i=0;i<num.length;i++){
            int curr=num[i];
            for(int j=i+1;j<num.length;j++){
                System.out.print("("+curr+","+j+")");
            }
            System.out.println();
        }

    }

    public static void Sub(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    public static void Sub2(int numbers[]){

        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end=j;
                for(int k=start;k<=end;k++){
                    System.out.print(numbers[k]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }

    public static void Maxsub(int numbers[]){
        int currsum=0;
        int maxsum=Integer.MIN_VALUE;

        for(int i=0;i<numbers.length;i++){
            int start=i;
            for(int j=i;j<numbers.length;j++){
                int end =j;
                currsum=0;
                for(int k=start;k<=end;k++){
                    currsum=currsum+numbers[k];
                }
                System.out.println(currsum);
                if(maxsum<currsum){
                    maxsum=currsum;
                }
            }
        }
        System.out.println("Max sum = "+maxsum);
    }


}