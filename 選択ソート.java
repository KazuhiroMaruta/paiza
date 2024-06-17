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

	static void selectionSort(int a[], int n) {
		for (int i = 0; i < n - 1; i++) {
			// 変数 minIndex を用意する
			int minIndex = i;
			// j が i+1 から n-1 までの for 文を用意する
			for (int j = i + 1; j < n; j++) {
				// A_j < A_{minIndex} なら
				if(a[j] < a[minIndex]){
				// minIndex を j に更新する
				minIndex = j;
				}
			}

			// A_i と A_{minIndex} を交換する
			int min = a[minIndex];
			a[minIndex] = a[i];
			a[i] = min;

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

		selectionSort(a, n);
	}
}
