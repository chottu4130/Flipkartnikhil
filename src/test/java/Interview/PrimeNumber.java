package Interview;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int num = 1; num <=100; num++) {
			int count=0;
			for (int i = 2; i < num; i++) {
				if(num%i==0)
				{
					count++;
					break;
				}
			}
			if(count==0) {
				System.out.println(num);
			}
		}

	}

}
