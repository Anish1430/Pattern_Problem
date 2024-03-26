import java.util.Scanner;

public class HollowHourGlassPattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();

         //For First Half
          for(int i=1;i<=n;i++){ //i=1
             for(int j=1;j<=i;j++) { //j=1
                    System.out.print(" ");
             }

               for(int j=i;j<=n;j++){
                   if(j==n || j==i || i==1) {
                       System.out.print("* ");
                   }
                   else {
                       System.out.print("  ");   //double space
                   }
               }
             System.out.println();
         }

         //For second Half
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<i;j++) {
                System.out.print(" ");
            }

            for(int j=i;j<=n;j++){
                if(j==n || j==i || i==1)
                    System.out.print("* ");
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
