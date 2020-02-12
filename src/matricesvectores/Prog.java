package matricesvectores;

public class Prog {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int [] v = {1,2,3};
			int [] v2 = Mat.producto(3, v);
			for(int i = 0; i < v2.length; i++ ) {
				System.out.println(v2[i]);
			}
			System.out.println(Mat.toString(v2, "v2 = v*5"));
			int [][] v3 = {{1,2,4},{2,3,1}};
			int [][] v4 = Mat.producto(8, v3);
			System.out.println(Mat.toString(v4, "v4 = v3*3"));
			System.out.println(Mat.esIgual(v, v));
	}

}
