package main;

import java.util.Scanner;

public class VelocityCompute {

	public static void main(String[] args) {
		
		final double r = 3;
        final double T = 60;
        int[] speed = {1,10,20,40}; 
        double mass;
        double maxVelocity = 0;
        
        Scanner in = new Scanner(System.in);
        
        while(true){
        	
            int i = 0;
            
            System.out.print("1.Enter mass : ");
            mass = in.nextDouble();
            
            if(mass == 0) break;
            
            while(T>mass*speed[i]*speed[i]*r){
            	
                maxVelocity = mass*speed[i]*speed[i]/r;
                i++;
                
            }
            
            System.out.println("Max Velocity is: " + maxVelocity);
        }
    }

}
