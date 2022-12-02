package KleinCipher;

public class LAT {

	public static void main(String[] args) {

		int Sbox[] = {7, 4, 10, 9, 1, 15, 11, 0, 12, 3, 2, 6, 8, 14, 13, 5};
		int lat[][] = lat(Sbox, 4, 4);
		for(int i=0; i<(int)Math.pow(2, 4); i++) {
			for(int j=0; j<(int)Math.pow(2, 4); j++) {
				System.out.printf("%2d ", lat[i][j]);
			}
			System.out.println();
		}
	}
	
	public static int[][] lat(int Sbox[], int n, int m) {
		
		int lat[][] = new int[(int)Math.pow(2, n)][(int)Math.pow(2, m)];
		
		for(int i=0; i<(int)Math.pow(2, n); i++) {
			for(int j=0; j<(int)Math.pow(2, m); j++) {
				lat[i][j] = bias_integer(Sbox, i, j, n);
			}
		}
		
		return lat;
	}
	
	public static int bias_integer(int Sbox[], int alpha, int beta, int n) {
		
		int e = 0;
		for(int x =0; x<(int)Math.pow(2, n); x++) {
			if((dot(alpha, x) ^ dot(beta, Sbox[x])) == 0) {
				e += 1;
			}
		}
		return (int) (e - Math.pow(2, n-1));
	}
	
	public static int dot(int u, int v) {
		
		int w = u & v;
		int dot = 0;
		while(w != 0) {
			dot ^= w & 1;
			w >>= 1;
		}
		
		return dot;
	}
}
