
import java.util.Scanner;

public class Jan21BP1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String a1 = scan.nextLine();
        String a2 = scan.nextLine();
        scan.close(); 
        int len1 = a1.length();
        int len2 = a2.length();
        int cnt = 1;
        int place = -1;
        for (int i=0; i<len2; i++){
            
            for (int j=0; j<len1; j++){
                if(a2.charAt(i) == a1.charAt(j)){
                    if(j>place){
                        place=j;
                    }
                    else if(j<=place){
                        cnt ++;
                        place = j;
                    }
                }
            }
        }
        
        System.out.println(cnt);
    }

}


