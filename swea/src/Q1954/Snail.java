package Q1954;

import java.util.Scanner;

public class Snail {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tc = sc.nextInt();
		int n;
		int[][] arr;

		// 이번 문제의 패턴은 우, 하, 좌, 상
		int[] dx = { 0, 1, 0, -1 }; // x축 상하로 이동
		int[] dy = { 1, 0, -1, 0 }; // y축 좌우로 이동

		for (int t = 1; t <= tc; t++) {

			n = sc.nextInt();
			arr = new int[n+1][n+1]; // 크기가 n인 배열 생성, *이때 +1을 해주어야함
			int dir = 0; // 위치

			// 배열을 그래프처럼 생각 할 수 있다
			int x = 0;
			int y = 0;

			for (int i = 0; i < n * n; i++) { // 칸이 총 n*n개

				arr[x][y] = i + 1; // {0,0}에 1부터 대입
				x += dx[dir];
				y += dy[dir];// 처음에 우측으로 이동

				if (x < 0 || x >= n || y < 0 || y >= n) { // x,y가 음수이거나 n보다 같거나 크면 방황전환

					// 원래 자리로 이동
					x -= dx[dir];
					y -= dy[dir];

					dir = (dir + 1) % 4; // dir은 최대 3의 값가지 가지므로 4로 나누면 3까지만 반복

					// 방향 전환 후 이동
					x += dx[dir];
					y += dy[dir];

				}
				// 다음 자리에 이미 값이 들어 있을때
				if (arr[x][y] != 0) { 
					// 원래 자리로 이동
					x -= dx[dir];
					y -= dy[dir];

					dir = (dir + 1) % 4; // dir은 최대 3의 값가지 가지므로 4로 나누면 3까지만 반복

					// 방향 전환 후 이동
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
