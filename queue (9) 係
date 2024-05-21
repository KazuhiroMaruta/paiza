import java.util.*;

/*データ構造の queue と同様の働きをするロボットがあります。
　ロボットは指示に応じて配列 A に対して 2 種類の仕事を行います、仕事の内容は以下の通りです。
　・in n と指示された場合、A の末尾に n を追加してください。
　・out と指示された場合、A の先頭の要素を削除してください。
　　ただし、A が既に空の場合、何も行わないでください。
　ロボットに与えられる指示の回数 N と、各指示の内容 S_i が与えられるので、
　ロボットが全ての処理を順に行った後の A の各要素を出力してください。
　なお、初め配列 A は空であるものとします */

public class Main {
    public static void main(String[] args) {
        
        // 指示を格納
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        ArrayList<Integer> a = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            String shiji = scanner.next();
            if (shiji.equals("in")) {
                int digit = scanner.nextInt();
                a.add(digit);
            } else if(a.size() > 0) {
                a.remove(0);
            }
        }
        
        // 出力
        for (int x : a) {
            System.out.println(x);
        }
    }
}
