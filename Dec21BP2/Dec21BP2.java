import java.io.*;
import java.util.StringTokenizer;

public class Dec21BP2 {
        static BufferedReader in;
        static PrintWriter out;
        static StringTokenizer tokenizer;
        static Int stallNum = 0;
        static int[][] cowInfo;

    public static void main(String[] args)throws IOException{
        boolean isFileInOut = true;
        if (isFileInOut) {
            in = new BufferedReader(new FileReader("file.in"));
            out = new PrintWriter(new FileWriter("file.out"));
        } else {
            in = new BufferedReader(new InputStreamReader(System.in));
            out = new PrintWriter(System.out);
        }
        stallNum = Integar.parseInt(in.readLine());
        cowInfo = new int [3][stallNum];
        for (int i=0; i<2 ; i++){
            tokenizer = new StringTokenizer(in.readLine());
            for(int j=0; j<stallNum ; j++){
                stallNum[i][j] = Integar.parseInt(tokenizer.nextToken());
            }
        }
        in.close();
        for (int i=0; i<stallNum ; i++){
            stallNum[2][i] = stallNum[0][i] - stallNum[1][i];
        }

        
    }
}
