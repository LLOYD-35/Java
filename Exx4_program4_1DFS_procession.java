public class Exx4_program4_1DFS_procession {
	static int v,e;
	static int[][] a;
	static boolean[] visited;
	public static void dfs(int v)
	{
		
		visited[v]=true;
		System.out.print(v+1+" ");
		for(int i=1;i<=a.length-1;i++)
			if(a[v][i]==1&&!visited[i])
				dfs(i);
	}
	public static void main(String[] args) {
		v=5;
		e=8;
		a= new int[v+1][v+1];
		visited=new boolean[v+1];
		a[0][1]=a[1][0]=1;
		a[0][2]=a[2][0]=1;
		a[0][4]=a[4][0]=1;
		a[1][0]=a[0][0]=1;
		a[1][2]=a[2][0]=1;
		a[2][0]=a[0][2]=1;
		a[2][1]=a[1][2]=1;
		a[2][3]=a[3][2]=1;
		a[2][4]=a[4][2]=1;
		a[3][2]=a[2][3]=1;
		a[3][5]=a[5][3]=1;
		a[4][0]=a[0][4]=1;
		a[4][2]=a[2][4]=1;
		a[5][2]=a[2][5]=1;
		a[5][3]=a[3][5]=1;
		dfs(0);
	}
}
