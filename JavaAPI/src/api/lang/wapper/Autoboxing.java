package api.lang.wapper;

public class Autoboxing {

	public static void main(String[] args) {
		
		//Autoboxing -> 자동형변환
		int a = 100;
		Integer val = a;
		
		a = val;
		
		Object[] arr = {1,2,3};
		
		int v = Integer.parseInt("3");
		int v1 = Integer.parseInt("34");
		Double v2 = Double.parseDouble("3.14");
		Long v3 = Long.parseLong("2345455452535");
		
		System.out.println(v + v1 + v2 + v3);
		
		
	}
	
	
}
