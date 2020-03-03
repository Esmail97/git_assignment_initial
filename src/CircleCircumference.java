public class CircleCircumference implements ISubscriber {
    public CircleCircumference() {
    }
    
    public  void calcCircleCircumference (int r) {
        double Circumference = 2*3.14*r ;
        System.out.println("Circle Circumference is : " + Circumference );
    }
    
    public void notifySubscriber(String input){
        
        calcCircleCircumference(Integer.parseInt(input));
    }
}
