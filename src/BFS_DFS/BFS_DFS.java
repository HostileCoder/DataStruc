package BFS_DFS;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BFS_DFS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node node40 =new Node(40);
		Node node10 =new Node(10);
		Node node20 =new Node(20);
		Node node30 =new Node(30);
		Node node60 =new Node(60);
		Node node50 =new Node(50);
		Node node70 =new Node(70);
		Node node80 =new Node(80);
		
		
		Node node51 =new Node(51);
		Node node52 =new Node(52);
		
		node10.addchild(node20);   
		node10.addchild(node30); 		
		node10.addchild(node40);
												
		node20.addchild(node50); 
		node20.addchild(node60);
		node30.addchild(node70);
		node30.addchild(node80);
		
		node50.addchild(node51);
		node51.addchild(node52);
		
		
		DFSStack(node10);
		
		BFSQueue(node10);
		
	}

	public static void DFS(Node root){
		
	}
	
	
	
	public static void DFSStack(Node node)
	{
		Stack<Node> stack= new  Stack<Node>();
		stack.add(node);
		
		while (!stack.isEmpty())
		{
			Node element=stack.pop();
			System.out.print(element.data + " ");
 
			List<Node> chidlren=element.getChildren();
			
			for (int i = 0; i <chidlren.size(); i++) {
				Node n=chidlren.get(i);
				if(n!=null)
				{
					stack.add(n);
		
				}
			}
		}
		System.out.print("\n");
	}
	
	public static void BFSQueue(Node node)
	{
		Queue<Node> queue= new LinkedList<Node>();
		queue.add(node);
		
		while (!queue.isEmpty())
		{
			Node element=queue.remove();
			
			System.out.print(element.data + " ");
 
			List<Node> chidlren=element.getChildren();
			
			for (int i = 0; i <chidlren.size(); i++) {
				Node n=chidlren.get(i);
				if(n!=null)
				{
					queue.add(n);
		
				}
			}
		}
		System.out.print("\n");
	}
	
}


