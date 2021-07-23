// �־��� �׷����� ���� �켱 Ž������ ��ȸ�Ѵ�.
// �Է�: �׷��� G=(V,E)
// ���: �� ������ "visit"���� ǥ�õ� �׷��� G, ���� �켱 Ž������ ó������ �湮�ϴ� ������� ��µ� ������.
import java.util.*;

public class Exx_2_program4_1DFSearch {
	//	���� v�� ����� �湮���� ���� �������� DFS�� �̿��� ��������� �湮�Ѵ�.
	public static void DFS(Node v)
	{
		//	���� v�� ������ ������ ���
		System.out.print(v.info + " ");
		
		//	���� v�� '�湮��'���� ǥ��
		v.visited=true;
		
		//	���� v�� ������ �������� ���� ����� ������ ����.
		List<Node> neighbours = v.getNeighbours();
		
		//	���� v�� ������ �湮���� ���� ��� �����鿡 ���� DFS ����
		for(int i=0;i<neighbours.size();i++)
		{
			Node w=neighbours.get(i);	//	.get()�� ���ڷ� index�� �޾� index ��ġ�� �ִ� object�� return��
			if(w!=null&&!w.visited)		//	w�� null�� �ƴϰ� w.visited�� false�� ����
				DFS(w);
			
		}
	}
	public static void main(String[] args) {
		//	�־��� ������ �׷����� ���� ������� ǥ���Ѵ�.
		
		//	�������� ǥ���Ѵ�.
		Node[] node= new Node[6];
		
		for(int i=0;i<node.length;i++)
			node[i]=new Node(i+1);
		
		//	�������� ǥ���Ѵ�.
		node[0].addNeighbours(node[1]);		//	node 1 -> 2,3,5
		node[0].addNeighbours(node[2]);
		node[0].addNeighbours(node[4]);
		node[1].addNeighbours(node[0]);		//	node 2 -> 1,3
		node[1].addNeighbours(node[2]);
		node[2].addNeighbours(node[0]);		//	node 3 -> 1,2,4,5
		node[2].addNeighbours(node[1]);
		node[2].addNeighbours(node[3]);
		node[2].addNeighbours(node[4]);
		node[3].addNeighbours(node[2]);		//	node 4 -> 3,6
		node[3].addNeighbours(node[5]);		//	
		node[4].addNeighbours(node[0]);		//	node 5 -> 1,3
		node[4].addNeighbours(node[2]);	
		node[5].addNeighbours(node[2]);		//	node 6 -> 3,4
		node[5].addNeighbours(node[3]);
		//	�־��� ������ �׷����� ���� �켱 Ž������ ��ȸ�Ѵ�.
		System.out.println("��͸� ����� ���� �켱 Ž�� ���� ��� ");
		DFS(node[0]);
	}

}
