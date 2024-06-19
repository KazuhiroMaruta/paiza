import java.util.*;

/*あなたはボウリングをしています。
  フレームの 1 投目を投げ終わったあなたは、次に狙うピンの番号と残っているピンの本数を知りたくなりました。
  ピンの情報が与えられるので、狙うべきピンの番号と残っているピンの本数を求めてください。
　狙うピンの決め方は次の通りとします。
　残っているピンのうち、先頭 (P_1側) のピンを狙います。
　ただし、同じ列に複数ピンがある場合は、それらのうちピン番号が最も小さいピンを狙います。 */

public class Main {
    public static void main(String[] args) {

        // 配列Pを取得
        Scanner sc = new Scanner(System.in);
        int[] p = new int[10];
        for (int i = 9; i > -1; i--) {
            p[i] = sc.nextInt();
        }

        // 先頭ピンと残りのピンを取得
        int target = 0;
        int rest = 0;
        for (int i = 0; i < 10; i++) {
            if (p[i] == 1) {
                if (target == 0) {
                    target = i + 1;
                }
                rest += 1;
            }
        }

        System.out.println(target);
        System.out.println(rest);
    }
}
