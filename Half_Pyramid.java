import java.util.Scanner;

public class Half_Pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          int cols=sc.nextInt();
          int rows=sc.nextInt();
          for(int i=1;i<=cols;i++) {
              for(int j=1;j<=i;j++) {
                  System.out.print("*");
              }
              System.out.println();
          }
    }
}
