public class AdvPattern {
    public static void main(String[] args) {
        //Hollow_rect();

       // pyramid(4);
        //Numpyramid();
        Floyd();
    }

    public static void Hollow_rect() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i == 1 || i == 4 || j == 1 || j == 5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();

        }
    }

    public static void pyramid(int row){

        for(int i=1;i<=row;i++){
            for (int space=1;space<=row-i;space++){
                System.out.print(" ");
            }
            for(int star=1;star<=i;star++){
                System.out.print("*");
            }
            System.out.println();
        }
        

    }

    public static void Numpyramid(){
        for(int i=1;i<=5;i++){
            for(int j=1;j<=5-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void Floyd(){
        int n=1;
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(n+" ");
                n++;
            }
            System.out.println();
        }
    }

}
