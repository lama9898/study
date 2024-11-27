package javaStudy.day30;

public class CuttingPaper {
	// 중복해서 자를 수 없음
	public int solution01(int M, int N) {
        return M - 1 + (N - 1 ) * M;
    }

	public int solution02(int M, int N) {
        int answer = 0;

        int[][] dp = new int[101][101];

        for(int i=2; i<dp.length; i++){
            dp[1][i] = dp[i][1] = i-1;
        }

        for(int i=2; i<dp.length; i++){
            for(int j=1; j<dp.length; j++){
                dp[i][j] = dp[1][j] + dp[i-1][j]+1;
            }
        }

        return dp[M][N];
    }
}
