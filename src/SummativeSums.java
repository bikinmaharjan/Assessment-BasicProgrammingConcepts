
public class SummativeSums {
	public void arraySum(int[] arr) {
		int sum =0;
		for(int a : arr) {
			sum += a;
		}
		System.out.println("Array Sum: " + sum);
	}
	
	public static void main(String[] args) {
		SummativeSums s = new SummativeSums();
		
		int[] a1 = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
		int[] a2 = { 999, -60, -77, 14, 160, 301 };
		int[] a3 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130, 
			140, 150, 160, 170, 180, 190, 200, -99 };
		
		s.arraySum(a1);
		s.arraySum(a2);
		s.arraySum(a3);
	}
}
