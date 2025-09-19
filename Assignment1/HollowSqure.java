import java.util.*;
public class HollowSqure {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("\n--- Pattern 15: Hollow Square ---");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
