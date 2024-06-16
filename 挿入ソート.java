import java.util.Scanner;

public class Main {
	static void print(int a[], int n) {
		for (int i = 0; i < n; i++) {
			if (i > 0)
				System.out.print(" ");
			System.out.print(a[i]);
		}
		System.out.println();
	}

	static void insertionSort(int a[], int n) {
		for (int i = 1; i < n; i++) {

			// 先に a[i] を保存しておき、x とする
			int x = a[i];
			// 挿入する位置を探すための変数 j を用意する
			int j = i - 1;

			// j が 0 以上かつ a[j] が x より大きい間
			while (j >= 0 && a[j] > x) {
				// a[j] を 1 つ右にずらす
                a[j + 1] = a[j];
				// j を 1 減らす
				j--;
			}

			// a[j+1] に x を挿入する
			a[j + 1] = x;

			print(a, n);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		insertionSort(a, n);
	}
}
