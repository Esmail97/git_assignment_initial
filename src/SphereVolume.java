public class SphereVolume implements ISubscriber {

    public double spherevolume(String r) {
    	
    	double radius=Integer.parseInt(r);
    	double volume = (4*22*radius*radius*radius)/(3*7);
    	return volume;
    }

    public void notifySubscriber (String input) {
        
    	System.out.println("Sphere Volume is: " + spherevolume(input));
    }
    
    
}