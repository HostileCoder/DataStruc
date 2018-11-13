package unweighted_shortest_path;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class vertex {
	public String name;
	public List<vertex> adj=new ArrayList<vertex>();
	public boolean known=false;
	public int dist=9999;
	public vertex path;
	
	public vertex(String name){
		this.name=name;
	}

	public void addadj(vertex v){
		adj.add(v);
	}
	
	
	public static void unweighted(vertex s){

		Queue<vertex> q = new LinkedList<vertex>();
		
		for(vertex i:vertexs.vs){
			i.dist=9999;
		}
					
		s.dist=0;
		q.add(s);
		
		while(!q.isEmpty()){
			
			vertex v=q.remove();
			for(vertex i: v.adj){
				if(i.dist==9999){				
					i.dist=v.dist+1;
					i.path=v;
					q.add(i);
				
				}
			}
			v.known=true;
		}
	
	}
	
	
	public static void printPath(vertex v){
		if(v.path!=null){
			printPath(v.path);
			System.out.print(" to ");
		}
		System.out.print(v);
	}
	
	public String toString(){
		return this.name;		
	}
}


