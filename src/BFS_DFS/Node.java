package BFS_DFS;

import java.util.ArrayList;
import java.util.List;

public class Node
{
	int data;
	List<Node> children;

	Node(int data)
	{
		this.data=data;
		this.children= new ArrayList<Node>();
	}
	
	public void addchild(Node child)
	{
		this.children.add(child);
	}
	
	public List<Node> getChildren() {
		return children;
	}
	
	public void setChildren(List<Node> children) {
		this.children = children;
	}
}