/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
//import javax.swing.text.html.parser.Parser;
/**
 *
 * @author Eslam ismail
 * 
 */

public class CycleArea implements ISubscriber {
    public CycleArea() {
		// TODO Auto-generated constructor stub
	}

	public double CycleArea(double r){
		double area =3.14*(r*r);
                return area ;
	}

	@Override
	public void notifySubscriber(String input) {

		int r = Integer.parseInt(input);
                System.out.println("CycleArea is : " + CycleArea(r));

	}

    
    
}
