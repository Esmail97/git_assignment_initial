
 public class Fibonacci_2 implements ISubscriber {

	 static int fib(int n) {
		 
		 if (n <= 1)
			 return n;
		 
	      return fib(n-1) + fib(n-2);
	    } 
	 
	 @Override
	    public void notifySubscriber(String input) {
		System.out.println("Fibonacci_2 of " + '(' + input + ')' + " = " + fib(Integer.parseInt(input)));
	 }
}
