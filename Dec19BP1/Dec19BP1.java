import java.io.BufferedReader;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*import java.io.InputStreamReader;*/
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class Dec19BP1 {
    static BufferedReader in;
    static PrintWriter out;
    static int[][] cowInfo;
    public static void main(String[] args) throws IOException{
        boolean isSubmit = true;
        if (isSubmit){
            in = new BufferedReader(new FileReader("gymnastics.in"));
            out = new PrintWriter(new FileWriter("gymnastics.out"));
        }
        StringTokenizer tokenizer = new StringTokenizer(in.readLine());
        int trainNum = Integer.parseInt(tokenizer.nextToken());
        int cowNum = Integer.parseInt(tokenizer.nextToken());
        cowInfo = new int[trainNum][cowNum];
        for (int i = 0; i < trainNum; i++){
            tokenizer = new StringTokenizer(in.readLine());
            for (int j = 0; j < cowNum; j++){
                cowInfo[i][j] = Integer.parseInt(tokenizer.nextToken());
            }
        }
        in.close();
        int a = 0;
        int b = 0;
        int pair = 0;
        for (int i = 0; i < cowNum; i++){
            a = cowInfo[0][i];
            for (int j = i+1 ; j < cowNum; j++){
                b = cowInfo[0][j];
                if(isFit(a,b)){ 
                    pair++;
                    }
                }
            }
            out.print(pair);
            out.close();
        }

        static int info1 = -1;
        static int info2 = -1;

        public static boolean isFit(int a, int b){
            for(int i = 1; i<cowInfo.length;i++){
                for(int j = 0; j<cowInfo[i].length;j++){
                    if (cowInfo[i][j]==a){
                        info1 = j;
                    } else if(cowInfo[i][j]==b){
                            info2 = j;
                        }
                    }
            if (info1 > info2){
                return false;
        }
            
            }
            return true;
      
        }
        
    }



