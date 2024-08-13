package programs;

public class PrimeAndCompositeNumbers {

	public static void main(String[] args) {
		prime_CompositeNumbers(29);
	}

	static void  prime_CompositeNumbers(int n){
		
		//prime number  divisable by 1 and by its own
		if(n==1) {
			System.out.println("Neither Prime Nor Composite");
		}
		else if(n==2) {
			//Smallest even prime number
			System.out.println("Prime");
		}else if(n%2== 0 &&n>2 ) {
			//composite Number, divisable by 1 and by its own at least one other number so total 3 .
			System.out.println("Composite");
		}else {
			boolean isPrime = true;
			for(int i=3;i<=Math.sqrt(n);i+=2) {
				if(n%i==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println("Prime");
			}else {
				System.out.println("Composite");
			}
		}

		
	}

}
