import java.io.*;
import java.util.StringTokenizer;

public class Dec21BP1 {
    static int n,k;
    static long ans;
    static String cow;
    static int[] l;
    static int[] r;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        cow = st.nextToken();
        l=new int[n+5];
        r=new int[n+5];
        k=1;
        ans=0;
        for(int i=1;i<n;i++){
            if(cow.charAt(i)==cow.charAt(i-1)){
                l[i]=0;
                k++;
            }else{
                l[i]=k;
                k=1;
            }
        }
        
        k=1;
        for(int i=n-2;i>=0;i--){
            if(cow.charAt(i)==cow.charAt(i+1)){
                r[i]=0;
                k++;
            }else{
                r[i]=k;
                k=1;
            }
        }
        for(int i=0;i<n;i++){
            if(l[i]>0&&r[i]>0){
                ans+=((long)l[i]*r[i]);
            }
            if(l[i]>=2){
                ans+=l[i]-1;
            }
            if(r[i]>=2){
                ans+=r[i]-1;
            }

        }
        pw.println(ans);
        pw.close();
        br.close();
    }
}