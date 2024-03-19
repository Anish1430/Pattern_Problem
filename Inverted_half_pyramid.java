import java.util.Scanner;

public class Inverted_half_pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         //1st Method
//         int cols=sc.nextInt();
//         int rows=sc.nextInt();
//         for(int i=1;i<=cols;i++) {
//             for(int j=rows;j>=i;j--) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

    //2nd Method in java
        int rows=sc.nextInt();
        for(int i=rows;i>=1;i--) {
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
