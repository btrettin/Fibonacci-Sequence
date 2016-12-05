
public class Fibbo {

	/**
	 * 
	 * This gives some wierd numbers bro
	 */
	public static void main(String[] args) {
		double first=1;
		double second=1;
		double third=2;
		for(int a=0; a<110; a=a+1){
			double next=second+third;
			System.out.println(first);
			first=second;
			second=third;
			third=next;
		
		}
	}

}
