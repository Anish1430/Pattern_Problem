import java.util.Scanner;

public class FloydsTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
         int n=5;
         int num=1;
         for(int i=n;i>=1;i--){
             for(int j=i;j<=n;j++) {
                 System.out.print(num+" ");
                   num++;
             }

             System.out.println();
         }
    }
}
