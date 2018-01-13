import java.util.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scn = new Scanner(System.in);
        String val = scn.next();
        int digs[] = new int[4];
        for (int i=0;i<4;i++){
            digs[i] = val.charAt(i) - '0';
        }
        String digNum[][] = {
                {"*****",
                 "*   *",
                 "*   *",
                 "*   *",
                 "*****"},
                {"    *",
                 "    *",
                 "    *",
                 "    *",
                 "    *"},
                {"*****",
                 "    *",
                 "*****",
                 "*    ",
                 "*****"},
                {"*****",
                 "    *",
                 "*****",
                 "    *",
                 "*****"},
                {"*   *",
                 "*   *",
                 "*****",
                 "    *",
                 "    *"},
                {"*****",
                 "*    ",
                 "*****",
                 "    *",
                 "*****"},
                {"*****",
                 "*    ",
                 "*****",
                 "*   *",
                 "*****"},
                {"*****",
                 "    *",
                 "    *",
                 "    *",
                 "    *"},
                {"*****",
                 "*   *",
                 "*****",
                 "*   *",
                 "*****"},
                {"*****",
                 "*   *",
                 "*****",
                 "    *",
                 "    *"}
        };
        for (int i=0;i<5;i++){
            for (int j=0;j<4;j++){
                System.out.print(digNum[digs[j]][i]+" ");
            }
            System.out.println();
        }
    }
}
