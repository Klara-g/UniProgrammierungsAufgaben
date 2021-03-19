package b04a3;
public class TestGeometrie{
	public static void main(String[] args){
		System.out.println (Geometrie.flaecheREck(2,-1));
		System.out.println (Geometrie.flaecheREck(-5,-3));
		System.out.println (Geometrie.flaecheREck(2,2));
		System.out.println (Geometrie.flaecheREck(-10,10));

		System.out.println (Geometrie.umfangREck(2,1));
		System.out.println (Geometrie.umfangREck(5,3));
		System.out.println (Geometrie.umfangREck(2,2));
		System.out.println (Geometrie.umfangREck(10,10));


	}
} 