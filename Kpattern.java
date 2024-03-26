import java.util.Scanner;

public class Kpattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();

          //For First Half Printing.....
          for(int i=1;i<=n;i++) {
              for(int j=n;j>=i;j--){
                  System.out.print("* ");
              }
              System.out.println();
          }

           //For Second Half Printing.....
        for(int i=2;i<=n;i++) {
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
