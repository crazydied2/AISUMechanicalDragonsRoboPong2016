
package org.usfirst.frc.team5974.robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.CameraServer; //The Camera\
import edu.wpi.first.wpilibj.DigitalInput; //Digital inputs
import edu.wpi.first.wpilibj.Timer; // The Timer
import edu.wpi.first.wpilibj.IterativeRobot; //Guess
import edu.wpi.first.wpilibj.Joystick; //The Controller
import edu.wpi.first.wpilibj.VictorSP; //The Motor Controller
import edu.wpi.first.wpilibj.interfaces.Accelerometer;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard; //The Dashboard
import edu.wpi.first.wpilibj.ADXL362; //The Accelerometer
import edu.wpi.first.wpilibj.ADXRS450_Gyro;

public class Robot extends IterativeRobot {
    
	
    public void robotInit() {
    	
    }

    
    public void autonomousInit() {
    	
    }

    
    public void autonomousPeriodic() {
    	
    }

    
    public void teleopPeriodic() {
        if(leftBumper == true) {
		System.out.println("Left Bumper Pressed!"); //full speed ahead
    }
    else {
	    j1Y_axis = j1Y_axis/2; //goes half speed
	    j2Y_axis = j2Y_axis/2;
	    robotSpeed = robotSpeed/2;
    }
    if(xButton == true && yButton == true) {
    		System.out.println("Do a Barrel Roll");
    		upperLeftMotor.set(1);
    		lowerLeftMotor.set(1);
    		upperRightMotor.set(-1);
    		lowerRightMotor.set(-1);
    		Timer.delay(1);
    		upperLeftMotor.set(0);
    		lowerLeftMotor.set(0);
    		upperRightMotor.set(0);
    		lowerRightMotor.set(0);
    }

    public void testPeriodic() {
// tank drive controls
    	upperLeftMotor.set(J1Y_axis); //control left driving motors
	lowerLeftMotor.set(J1Y_axis);
	upperRightMotor.set(J1Y_axis); //control right driving motors
	lowerRightMotor.set(J1Y_axis);
    }
    
}
