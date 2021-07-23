// 주어진 그래프를 깊이 우선 탐색으로 순회한다.
// 입력: 그래프 G=(V,E)
// 출력: 각 정점이 "visit"으로 표시된 그래프 G, 깊이 우선 탐색에서 처음으로 방문하는 순서대로 출력된 정점들.
import java.util.*;

public class Exx_2_program4_1DFSearch {
	//	정점 v에 연결된 방문하지 않은 정점들을 DFS을 이용해 재귀적으로 방문한다.
	public static void DFS(Node v)
	{
		//	정점 v에 대응된 데이터 출력
		System.out.print(v.info + " ");
		
		//	정점 v를 '방문함'으로 표기
		v.visited=true;
		
		//	정점 v에 인접한 정점들의 연결 목록을 끄집어 낸다.
		List<Node> neighbours = v.getNeighbours();
		
		//	정점 v에 인접한 방문하지 않은 모든 정점들에 대해 DFS 수행
		for(int i=0;i<neighbours.size();i++)
		{
			Node w=neighbours.get(i);	//	.get()는 인자로 index를 받아 index 위치에 있는 object를 return함
			if(w!=null&&!w.visited)		//	w가 null이 아니고 w.visited가 false면 실행
				DFS(w);
			
		}
	}
	public static void main(String[] args) {
		//	주어진 무방향 그래프르 연결 목록으로 표현한다.
		
		//	정점들을 표현한다.
		Node[] node= new Node[6];
		
		for(int i=0;i<node.length;i++)
			node[i]=new Node(i+1);
		
		//	간선들을 표현한다.
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
		//	주어진 무방향 그래프를 깊이 우선 탐색으로 순회한다.
		System.out.println("재귀를 사용한 깊이 우선 탐색 실행 결과 ");
		DFS(node[0]);
	}

}
