import java.util.*;

/*paiza の入社試験では 科目 1 〜 5 の 5 科目のテストが課せられており、
  それぞれの科目には重みが設定されています。
　受験者の得点は各科目の (とった点数) * (科目の重み) となります。 
　5科目の得点の合計が最も高かった受験者の得点を求めてください。*/

public class Main {
    public static void main(String[] args) {

        // Nの数を取得
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        // 重みの設定を配列Mで取得
        int[] M = new int[5];
        for (int i = 0; i < 5; i++) {
            M[i] = scanner.nextInt();
        }
        
        // 受験者の得点を取得
        int[][] A = new int[N][5];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < 5; j++) {
                A[i][j] = scanner.nextInt();
            }
        }
        
        // 最も高かった受験者の得点を出力
        int max = 0;
        for (int i = 0; i < N; i++) {
            int score = 0;
            for (int j = 0; j < 5; j++) {
                score += A[i][j] * M[j];
            }
            max = Math.max(max, score);
        }
        System.out.println(max);
        
        
    }
}
