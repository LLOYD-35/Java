import java.util.Stack;

/**
 * Description : ���� ����� ����� DFS ����<br>
 * Date : 2021. 8. 13.<br>
 * History :<br>
 * - �ۼ��� : �ֿ�, ��¥ : 2021. 8. 13., ���� : �����ۼ�<br>
 *
 * @author �ֿ�
 * @version 1.0
 */
public class Exx4_program4_1DFS_procession {
	static int v,e;
	static int[][] a;
	static boolean[] visited;
	static int count;							//	�� ����� ����ġ�� ���� ���� ����
	public static void dfs(int v)
	{
		Stack<Integer> stack =new Stack<>(); 
		visited[v]=true;						//	������ ��忡 �湮���� ǥ��
		System.out.print(v +"  ");				//	�湮�� ��� ���
		stack.push(v);							//	�湮�� ��� ���ÿ� ����
		while(!stack.isEmpty())					//	������ �������� �ݺ�
		{			
			int minWeight=100000;				//	����ġ�� �ּڰ��� ���� ����
			int index = 0;						//	�ּڰ��� ���� ������ index�� ���� ����
			for(int i=1;i<=a.length-1;i++)		//	��� ������ ����.
			{
				if(a[v][i]>=1&&!visited[i])		//	v�� ������ ���� �� ����Ǿ��ְ� �湮���� ���� ������ ã�´�.
				{
					if(a[v][i]<minWeight)		//	�ش� ������ ����ġ�� min������ ������ �ش� ����ġ�� min�� �ְ� �ش� index�� ��´�.
					{	
						minWeight=a[v][i];
						index=i;
					}
				}	
			}
			if(index==0)						//	��� ������ �湮���� ��� ������ Top�� ������.
				stack.pop();
			else								//	�湮���� ���� ���� ������ ���� ��� ��� ȣ�� ����
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
		System.out.println("�� ����� ����ġ�� �� : "+ count);
	}
}
