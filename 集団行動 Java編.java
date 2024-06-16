import java.util.*;

/*あなたは集団行動のリーダーです。次のような指示を出すことで様々な列の操作ができます。
　・swap A B
　先頭から A 番目の人と、先頭から B 番目の人の位置を入れ替える。
　・reverse
　列の前後を入れ替える。
　・resize C
　先頭から C 人を列に残し、それ以外の人を全員列から離れさせる。ただし、列が既に C 人以下の場合、何も行わない。
　初め、列には番号 1 〜 N の N 人がおり、先頭から番号の昇順に並んでいます。(1, 2 , 3, ..., N)
　あなたの出した指示の回数 Q とその指示の内容 S_i (1 ≦ i ≦ Q) が順に与えられるので、
　全ての操作を順に行った後の列を出力してください。  */
  

public class Main {
    public static void main(String[] args) {
        
        // NとQを取得
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();

        // 番号を設定
        int[] people = new int[n];
        int length = n;
        for (int i = 0; i < n; i++) {
            people[i] = i + 1;
        }

        //  操作を実行
        for (int i = 0; i < q; i++) {
            String s = sc.next();
            if (s.equals("swap")) {
                int a = sc.nextInt();
                int b = sc.nextInt();

                int tmp = people[a - 1];
                people[a - 1] = people[b - 1];
                people[b - 1] = tmp;
            } else if (s.equals("reverse")) {
                for (int j = 0; j < length / 2; j++) {
                    int tmp = people[j];
                    people[j] = people[length - 1 - j];
                    people[length - 1 - j] = tmp;
                }
            } else {
                int c = sc.nextInt();
                length = Math.min(length, c);
            }
        }
        
        // 結果を出力
        for (int i = 0; i < length; i++) {
            System.out.println(people[i]);
        }
    }
}
