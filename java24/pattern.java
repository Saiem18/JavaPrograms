public class pattern {
    public static void main(String[] args) {
        // for(int i=1;i<=4;i++){
        //     System.out.println("****");
        // }

        // star();

       // inverted();

        //numstar();

       // newtar();
      //  invertstar();
      //  halfpyramid();
      charpy();

        
    }


    public static void star(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    public static void inverted(){
        int n=4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void numstar(){
        int num=1;
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num);
                num++;
            }
            System.out.println();
        }
    }

    public static void newtar(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
        }
    }

    public static void invertstar(){
        int n=5;
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void halfpyramid(){
        for(int i=1;i<=4;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();

        }
        
    }

    public static void charpy(){
        char ch= 'A';
        int n=5;

        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }

    

    }
}

