public class SphereVolume implements ISubscriber {

	public void notifySubscriber(String input) {

		double radius=Integer.parseInt(input);


		double Volume= (4*22*radius*radius*radius)/(3*7);
		System.out.println(Volume);
	}

}