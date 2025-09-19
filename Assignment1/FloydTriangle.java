import java.util.*;
public class FloydTriangle {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("\n--- Pattern 11: Floyd's Triangle ---");
        int num=1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
}
