import java.util.Stack;

/**
 * Description : 인접 행렬을 사용한 DFS 구현<br>
 * Date : 2021. 8. 13.<br>
 * History :<br>
 * - 작성자 : 주원, 날짜 : 2021. 8. 13., 설명 : 최초작성<br>
 *
 * @author 주원
 * @version 1.0
 */
public class Exx4_program4_1DFS_procession {
	static int v,e;
	static int[][] a;
	static boolean[] visited;
	static int count;							//	총 경로의 가중치의 합을 담을 변수
	public static void dfs(int v)
	{
		Stack<Integer> stack =new Stack<>(); 
		visited[v]=true;						//	임의의 노드에 방문함을 표시
		System.out.print(v +"  ");				//	방문한 노드 출력
		stack.push(v);							//	방문한 노드 스택에 삽입
		while(!stack.isEmpty())					//	스택이 빌때까지 반복
		{			
			int minWeight=100000;				//	가중치의 최솟값을 담을 변수
			int index = 0;						//	최솟값을 갖는 정점의 index를 담을 변수
			for(int i=1;i<=a.length-1;i++)		//	모든 정점을 돈다.
			{
				if(a[v][i]>=1&&!visited[i])		//	v의 인접한 정점 중 연결되어있고 방문하지 않은 정점을 찾는다.
				{
					if(a[v][i]<minWeight)		//	해당 정점의 가중치가 min값보다 작으면 해당 가중치를 min에 넣고 해당 index도 담는다.
					{	
						minWeight=a[v][i];
						index=i;
					}
				}	
			}
			if(index==0)						//	모든 정점이 방문했을 경우 스택의 Top을 꺼낸다.
				stack.pop();
			else								//	방문하지 않은 인접 정점이 있을 경우 재귀 호출 수행
			{
				count+=a[v][index];
				dfs(index);
			}
		}
	}
	public static void main(String[] args) {
		e=8;
		v=6;
		a= new int[v + 1][v + 1];
		visited=new boolean[v + 1];
		a[0][1]=a[1][0]=7;	
		a[0][2]=a[2][0]=6;
		a[0][4]=a[4][0]=3;
		a[1][2]=a[2][1]=1;
		a[2][4]=a[4][2]=3;
		a[2][3]=a[3][2]=2;
		a[2][5]=a[5][2]=7;
		a[3][5]=a[5][3]=5;
//		a[2][4]=a[4][2]=1;
//		a[1][2]=a[2][0]=1;
//		a[3][5]=a[5][3]=1;
//		a[4][0]=a[0][4]=1;
//		a[4][2]=a[2][4]=1;
//		a[5][2]=a[2][5]=1;
//		a[5][3]=a[3][5]=1;
		dfs(0);
		System.out.print("\n");
		System.out.println("총 경로의 가중치의 합 : "+ count);
	}
}
