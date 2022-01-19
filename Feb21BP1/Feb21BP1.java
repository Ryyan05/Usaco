import java.util.Scanner;

public class Feb21BP1 {
    static String[][] info;
    static int n;
    static String[] knowncowName;
    static int [] knowncowZodiac;
    static int [] knowncowAge;
    public static boolean isExisted
    public static void main(String[] args) {
        Scanner mScan = new Scanner(System.in);
        n = Integer.parseInt(mScan.nextLine());
        info = new String[n][8];
        knowncowName = new String [n*2];
        knowncowZodiac = new int [n*2];
        knowncowAge = new int [n*2];
        for (int i=0; i<n; i++){
            info[i]=mScan.nextLine().split(" ");
        }
        mScan.close();
        
        knowncowName[0] = "Bessie";
        knowncowAge[0] = 0;
        knowncowZodiac [0] = 0;
        int thecowIDX = 0;
        int knowncowIDX = 0;

        while (true) {
            for(int idxrow = 0; idxrow < n; idxrow++){
                if (info[idxrow][0].equals(knowncowName)[thecowIDX]&&!)
            }
        }
    }

}
