//	����� �׷����� BFS���� ��ȸ
import java.util.*;
public class Exx4_program4_3BFS_adjacencyList {
	private  Queue<Node> queue;	//	�湮�� �������� �����ϴ� ť
	
	public Exx4_program4_3BFS_adjacencyList()
	{
		queue = new LinkedList<Node>();
	}
	
	public void BFS(Node v)
	{
		//	v�� '�湮��'���� ǥ��
		v.visited=true;
		//	v�� ť�� �߰��Ѵ�.
		queue.add(v);
		
		while(!queue.isEmpty())
		{
			//	ť�� �� �տ� �ִ� ������ ������� element�� ����
			Node element=queue.remove();
			
			//	element�� ������ �����͸� ���
			System.out.print(element.info+ "  ");
			
			//	element�� ���� �������� ���� ����Ʈ�� ������ ����.
			List<Node> neighbours = element.getNeighbours();
			
			//	element�� ������ �湮���� ���� ��� �����鿡 ���� �ʺ� �켱 Ž���� ����
			for(int i=0;i<neighbours.size();i++)
			{
				//	w�� element�� ���� ����
				Node w=neighbours.get(i);
				if(w!=null&&!w.visited)
				{
					//	w�� '�湮 ����'�� ��� '�湮��'���� ǥ��
					w.visited=true;
					queue.add(w);	//	w�� ť�� �߰��Ѵ�.
				}
			}
		}
	}
	public static void main(String[] args) {
		//	�������� ǥ��
		Node node1=new Node(1);
		Node node2=new Node(2);
		Node node3=new Node(3);
		Node node4=new Node(4);
		Node node5=new Node(5);
		Node node6=new Node(6);
		
		//	�������� ǥ��
		node1.addNeighbours(node2);
		node1.addNeighbours(node3);
		node1.addNeighbours(node5);
		node2.addNeighbours(node1);
		node2.addNeighbours(node3);
		node3.addNeighbours(node1);
		node3.addNeighbours(node2);
		node3.addNeighbours(node4);
		node3.addNeighbours(node5);
		node4.addNeighbours(node3);
		node4.addNeighbours(node6);
		node5.addNeighbours(node1);
		node5.addNeighbours(node3);
		node6.addNeighbours(node3);
		node6.addNeighbours(node4);
		
		Exx4_program4_3BFS_adjacencyList bfsExample=new Exx4_program4_3BFS_adjacencyList();
		
		//	�־��� ������ �׷����� BFS�� ��ȸ�Ѵ�.
		System.out.println("�ʺ� �켱 Ž�� ���� ���");
		bfsExample.BFS(node1);
	}
}
