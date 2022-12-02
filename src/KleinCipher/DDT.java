package KleinCipher;

public class DDT {

	public static void main(String[] args) {

		int Sbox[] = {7,4,10,9,1,15,11,0,12,3,2,6,8,14,13,5};
		int DDT_Table[][] = new int[16][16];

		int arr[][] = new int [16][5];
		int u0,u1,v0,v1;
		
		for(int k=0;k<16;k++)
		{
			for(int i=0; i<16;i++)
			{
				int j=0;
				u0=i;
				arr[i][j]=i;
				u1=arr[i][++j]=u0^k;
				v0=arr[i][++j]=Sbox[u0];
				v1=arr[i][++j]=Sbox[u1];
				arr[i][++j]=v0^v1;
			}
		
			ddt_(arr,k, DDT_Table);
		}
			System.out.printf("DDT Table for given Sbox: \n");
			Table(DDT_Table);
			
		}

		public static void Table(int DDT_Table[][])
		{
			for(int i=0;i<16;i++)
			{
				for(int j=0;j<16;j++)
				{
					System.out.printf("%d ", DDT_Table[i][j]);
				}
				System.out.printf("\n");
			
			}		
		}

		public static int[][] ddt_(int arr[][], int x, int DDT_Table[][])
		{
			for(int i=0; i<16; i++)
			{
				int j=4;
				if(arr[i][j]==0)
					DDT_Table[x][0]++;
				if(arr[i][j]==1)
					DDT_Table[x][1]++;
				if(arr[i][j]==2)
					DDT_Table[x][2]++;
				if(arr[i][j]==3)
					DDT_Table[x][3]++;
				if(arr[i][j]==4)
					DDT_Table[x][4]++;
				if(arr[i][j]==5)
					DDT_Table[x][5]++;
				if(arr[i][j]==6)
					DDT_Table[x][6]++;
				if(arr[i][j]==7)
					DDT_Table[x][7]++;
				if(arr[i][j]==8)
					DDT_Table[x][8]++;
				if(arr[i][j]==9)
					DDT_Table[x][9]++;
				if(arr[i][j]==10)
					DDT_Table[x][10]++;
				if(arr[i][j]==11)
					DDT_Table[x][11]++;
				if(arr[i][j]==12)
					DDT_Table[x][12]++;
				if(arr[i][j]==13)
					DDT_Table[x][13]++;
				if(arr[i][j]==14)
					DDT_Table[x][14]++;
				if(arr[i][j]==15)
					DDT_Table[x][15]++;
					
					
			}
			
			return DDT_Table;
		
	}

}
