
public class Fibbo {

	public static void main(String[] args) {
		double first=1;
		double second=1;
		double third=2;
		for(int a=0; a<100; a=a+1){
			double next=second+third;
			System.out.println(first);
			first=second;
			second=third;
			third=next;
		
		}
	}

}
