public class Arrays2{
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5};

        // Reverse(numbers);

        // for(int i=0;i<numbers.length;i++){
        //     System.out.print(numbers[i]+" ");
        // }
        Pair2(numbers);
    }

    public static void Reverse(int numbers[]){
        int first=0 ; 
        int last=numbers.length-1;

        while(first<last){
            int temp=numbers[last];
            numbers[last]=numbers[first];
            numbers[first]=temp;

            first++;
            last--;
        }

    }

   /*  public static void Pairs(int numbers[]){
        for(int i=0;i<numbers.length;i++){
            int current=numbers[i];
            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+current+","+j+")");
            }
            System.out.println();
        }
    }*/

    public static void Pair2(int numbers[]){
        for(int i=0; i<numbers.length; i++){
            int current=numbers[i];

            for(int j=i+1;j<numbers.length;j++){
                System.out.print("("+ current +","+j+")");

            }
            System.out.println();

        

                        
        }

    

    }


}

