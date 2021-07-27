//	비방향 그래프를 BFS으로 순회
import java.util.*;
public class Exx4_program4_3BFS_adjacencyList {
	private  Queue<Node> queue;	//	방문할 정점들을 저장하는 큐
	
	public Exx4_program4_3BFS_adjacencyList()
	{
		queue = new LinkedList<Node>();
	}
	
	public void BFS(Node v)
	{
		//	v를 '방문함'으로 표시
		v.visited=true;
		//	v를 큐에 추가한다.
		queue.add(v);
		
		while(!queue.isEmpty())
		{
			//	큐의 맨 앞에 있는 정점을 끄집어내어 element에 저장
			Node element=queue.remove();
			
			//	element에 대응된 데이터를 출력
			System.out.print(element.info+ "  ");
			
			//	element에 인접 정점들의 연결 리스트를 끄집어 낸다.
			List<Node> neighbours = element.getNeighbours();
			
			//	element에 인접한 방문하지 않은 모든 정점들에 대해 너비 우선 탐색을 수행
			for(int i=0;i<neighbours.size();i++)
			{
				//	w는 element에 인접 정점
				Node w=neighbours.get(i);
				if(w!=null&&!w.visited)
				{
					//	w가 '방문 안함'일 경우 '방문함'으로 표시
					w.visited=true;
					queue.add(w);	//	w를 큐에 추가한다.
				}
			}
		}
	}
	public static void main(String[] args) {
		//	정점들을 표현
		Node node1=new Node(1);
		Node node2=new Node(2);
		Node node3=new Node(3);
		Node node4=new Node(4);
		Node node5=new Node(5);
		Node node6=new Node(6);
		
		//	간선들을 표현
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
		
		//	주어진 무방향 그래프를 BFS로 순회한다.
		System.out.println("너비 우선 탐색 실행 결과");
		bfsExample.BFS(node1);
	}
}
