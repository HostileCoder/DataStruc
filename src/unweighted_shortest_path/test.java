package unweighted_shortest_path;

public class test {

	public static void main(String[] args) {
		vertex v1=new vertex("v1");
		vertex v2=new vertex("v2");
		vertex v3=new vertex("v3");
		vertex v4=new vertex("v4");
		vertex v5=new vertex("v5");
		vertex v6=new vertex("v6");
		vertex v7=new vertex("v7");
		
		v1.addadj(v2);
		v1.addadj(v4);
		
		v2.addadj(v4);
		v2.addadj(v5);
		
		v3.addadj(v1);
		v3.addadj(v6);
		
		v4.addadj(v3);
		v4.addadj(v6);
		v4.addadj(v5);
		v4.addadj(v7);
		
		v4.addadj(v3);
		v4.addadj(v6);
		v4.addadj(v5);
		v4.addadj(v7);
		
		v5.addadj(v7);

		v7.addadj(v6);
		
		vertexs.addvertex(v1);
		vertexs.addvertex(v2);
		vertexs.addvertex(v3);
		vertexs.addvertex(v4);
		vertexs.addvertex(v5);
		vertexs.addvertex(v6);
		vertexs.addvertex(v7);
		
		
		vertex.unweighted(v3);
		vertex.printPath(v2);

	}

}
