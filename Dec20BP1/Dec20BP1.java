/**
 * Dec20BP1
 */
import java.util.Arrays;
import java.util.Scanner;
public class Dec20BP1 {
    public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        int[] num = new int[7];
        for(int i = 0; i<7 ; i++){
            num[i] = scan.nextInt();
        }
        scan.close(); 
        Arrays.sort(num);
        int A = num[0];
        int B = num[1];
        int C = num[6]-A-B;

        System.out.println(A+" "+ B +" "+C);
    }
}