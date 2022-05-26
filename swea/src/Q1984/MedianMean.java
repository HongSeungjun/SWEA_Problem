package Q1984;

import java.util.Scanner;

public class MedianMean {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// testcase ����
		int tc = sc.nextInt();

		// �߰� ��հ�
		float median;
		// �ּ�, �ִ�
		int max;
		int min;

		int sum;

		int[] num = new int[10];
		for (int t = 1; t <= tc; t++) {

			max = 0;
			min = 100001;
			sum = 0;

			// test case �� 10 ���� ���� �Է�
			// �ִ밪�� �ּڰ��� ���� max, min�� ����
			for (int i = 0; i < 10; i++) {

				num[i] = sc.nextInt();
				if (num[i] > max)
					max = num[i];
				if (num[i] < min)
					min = num[i];
				sum += num[i];
			}
			// �߰� ��հ��� �ִ񰪰� �ּڰ��� ���ְ� 8�� ������.
			median = (float) ((sum - (max + min)) / 8.0);
			// �Ҽ� 1�ڸ� ���� ǥ���ϱ� ���� String.format�� ���.
			System.out.println("#" + t + " " + String.format("%.0f", median));

		}

	}

}
