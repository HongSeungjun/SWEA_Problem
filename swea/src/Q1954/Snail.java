package Q1954;

import java.util.Scanner;

public class Snail {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();
		int n;
		int[][] arr;

		// �̹� ������ ������ ��, ��, ��, ��
		int[] dx = { 0, 1, 0, -1 }; // x�� ���Ϸ� �̵�
		int[] dy = { 1, 0, -1, 0 }; // y�� �¿�� �̵�

		for (int t = 1; t <= tc; t++) {

			n = sc.nextInt();
			arr = new int[n+1][n+1]; // ũ�Ⱑ n�� �迭 ����, *�̶� +1�� ���־����
			int dir = 0; // ��ġ

			// �迭�� �׷���ó�� ���� �� �� �ִ�
			int x = 0;
			int y = 0;

			for (int i = 0; i < n * n; i++) { // ĭ�� �� n*n��

				arr[x][y] = i + 1; // {0,0}�� 1���� ����
				x += dx[dir];
				y += dy[dir];// ó���� �������� �̵�

				if (x < 0 || x >= n || y < 0 || y >= n) { // x,y�� �����̰ų� n���� ���ų� ũ�� ��Ȳ��ȯ

					// ���� �ڸ��� �̵�
					x -= dx[dir];
					y -= dy[dir];

					dir = (dir + 1) % 4; // dir�� �ִ� 3�� ������ �����Ƿ� 4�� ������ 3������ �ݺ�

					// ���� ��ȯ �� �̵�
					x += dx[dir];
					y += dy[dir];

				}
				// ���� �ڸ��� �̹� ���� ��� ������
				if (arr[x][y] != 0) { 
					// ���� �ڸ��� �̵�
					x -= dx[dir];
					y -= dy[dir];

					dir = (dir + 1) % 4; // dir�� �ִ� 3�� ������ �����Ƿ� 4�� ������ 3������ �ݺ�

					// ���� ��ȯ �� �̵�
					x += dx[dir];
					y += dy[dir];
				}

			}
			
			System.out.printf("#%d\n",t );
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}

		}
	}
}
