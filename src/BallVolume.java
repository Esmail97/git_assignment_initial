/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ballvolume;

import java.util.Scanner;

/**
 *
 * @author esmai
 */
public class BallVolume {

    /**
     * @param args the command line arguments
     */
    
   public static double volume(double r){
        return (4/3*3.14)*(r*r*r);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double red = sc.nextDouble();
        
        System.out.println("Volume = " + volume(red) );
        
        
    }
    
}
