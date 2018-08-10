package in.co.shara.example.basic;

public class BasicFeatures {

	public static void main(String[] args) {
		BasicFeatures features = new BasicFeatures();
		features.variableTypes();
		features.arrayTypes();
		features.conditionalTypes();
	}

	public void variableTypes() {
		int a=0,b=0,c=0;
		float x= 0.0F;
		double y = 0.0D;
		boolean t=true,f=false;
		char d='S';
		byte e= - 0x7f;
		String message = "\"Hello, World\"";

		System.out.println(" a = " + a);
		System.out.println(" x = " + x);
		System.out.println(" y = " + y);
		System.out.println(" t = " + t);
		System.out.println(" d = " + d);
		System.out.println(" e = " + e);
		System.out.println(" message = " + message);
	}

	public void arrayTypes() {
		int[] numbers = { 23,45,65,4,78,8,9 };
		String[] messages = { "Hello", "Hi" };
		for(int i=0; i < numbers.length; i++) {
			System.out.println("Number at position " + (i+1) + " is " + numbers[i]);
		}

		for(String message : messages) {
			System.out.println("Message is " + message);
		}
		int i=0;
		while(i < messages.length) {
			System.out.println("Message at position " + (i+1) + " is " + messages[i]);
			i++;
		}
	}

	public void conditionalTypes() {
		int[] numbers = { 23,45,65,4,78,8,9 };
		for(int number : numbers) {
			if(number > 20) {
				System.out.println(number + " is greater than 20");	
			} else {
				System.out.println(number + " is less than or equal to 20");	
			}

		}
	}

}
