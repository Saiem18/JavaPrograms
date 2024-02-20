//Arrays are the list of elements of the same type placed in contiguous memory location
public class Arrays {
    public static void main(String[] args) {
        // int num[]={2,4,6,8,10,12,14};
        // int key=12;

        // int index=Linear(num,key);
        // if(index==-1){
        //     System.out.println("Not Found");

        // }
        // else{
        //     System.out.println("key is at "+index);
        // }

        // int l1[]={45,79,44,10,16};
        // System.out.println(Largest(l1));
        // System.out.println(Minimum(l1));

        int num[]={10,5,51,4,85,54};
        int key=51;
        int index=binary(num,key);
        System.out.println("Key is at index "+index);

    }

    public static int Linear( int num[], int key){
        for(int i=0;i<num.length;i++){
            if(num[i]==key){
                return i;
            }
            
        }
        return -1;
    }

    public static int Largest(int l1[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<l1.length;i++){
            if(l1[i]>max){
                max=l1[i];
            }
        }
        return max;
    }

    public static int Minimum(int l1[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<l1.length;i++){
            if(l1[i]<min){
                min=l1[i];
            }
        }
        return min;
    }

    public static int binary(int num[],int key){
        int start=0 , end=num.length -1;

        while(start<=end){

            int mid=(start+end)/2;

            if(num[mid]==key){ //found
                return mid;


            }

            if(num[mid]<key){ //left

                start=mid+1;
            }
            else{
                end=mid-1;
            }
            
        }
        return -1;
    }

}
