import java.util.Scanner;

public class InvertedHalfPyramidusing180 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          for(int i=1;i<=n;i++){
              for(int j=1;j<=n-i;j++) {  //3 space and 1 star
                                         //2 space and 2 star
                                         //3 space and 1 star
                                         //4 space and 0 star
                  System.out.print(" ");
              }
              for(int j=1;j<=i;j++) {
                  System.out.print("*");
              }
              System.out.println();
          }
    }
}
