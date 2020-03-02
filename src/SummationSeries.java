
public class SummationSeries implements ISubscriber {

	private int _summationSeries (int x)
	{
		return x * (x+1) / 2;
	}

	@Override
	public void notifySubscriber(String input) {
		// TODO Auto-generated method stub
		System.out.print("Summation series from 0 to ");
		System.out.print(input);
		System.out.print(" = ");
		System.out.println(_summationSeries(Integer.parseInt(input)));
	}
}
