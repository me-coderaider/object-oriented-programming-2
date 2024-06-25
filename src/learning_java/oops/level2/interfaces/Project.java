package learning_java.oops.level2.interfaces;

public class Project {

	public static void main(String[] args) {
//		ComplexAlgorithm algorithm=new DummyAlgorithm();
		ComplexAlgorithm algorithm=new RealAlgorithm();
		System.out.println(algorithm.complexAlgorithm(10, 14));
	}

}
