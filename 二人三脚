import java.util.*;

/*生徒の身長が A_1, ...., A_N であるような N 人のクラスで二人三脚の代表を決めることにしました。
　代表には、身長の差が最も小さいような 2 人を選出することにしました。
　選ばれた 2 人の身長を昇順に出力してください。*/

public class Main {
    public static void main(String[] args) {
        
        // Nを取得
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // 身長を取得
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
             a[i] = sc.nextInt();
        }
        
        // 身長を比較
        int rep1 = 0;
        int rep2 = 0;
        int diff = 100;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
             if(Math.abs(a[i] - a[j]) < diff){
                 diff = Math.abs(a[i] - a[j]);
                 if(a[i] > a[j]){
                     rep1 = a[j];
                     rep2 = a[i];
                 }else{
                     rep1 = a[i];
                     rep2 = a[j];
                 }
             } 
            }
        }
        
        // 出力
        System.out.println(rep1);
        System.out.println(rep2);
    }
}
