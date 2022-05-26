package Q1984;

import java.util.Scanner;

public class MedianMean {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		// testcase 개수
		int tc = sc.nextInt();

		// 중간 평균값
		float median;
		// 최소, 최댓값
		int max;
		int min;

		int sum;

		int[] num = new int[10];
		for (int t = 1; t <= tc; t++) {

			max = 0;
			min = 100001;
			sum = 0;

			// test case 당 10 개의 정수 입력
			// 최대값과 최솟값을 구해 max, min에 대입
			for (int i = 0; i < 10; i++) {

				num[i] = sc.nextInt();
				if (num[i] > max)
					max = num[i];
				if (num[i] < min)
					min = num[i];
				sum += num[i];
			}
			// 중간 평균값은 최댓값과 최솟값을 빼주고 8로 나눈다.
			median = (float) ((sum - (max + min)) / 8.0);
			// 소수 1자리 까지 표기하기 위해 String.format을 사용.
			System.out.println("#" + t + " " + String.format("%.0f", median));

		}

	}

}
