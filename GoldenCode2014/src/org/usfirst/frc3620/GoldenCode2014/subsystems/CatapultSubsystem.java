// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
package org.usfirst.frc3620.GoldenCode2014.subsystems;
import org.usfirst.frc3620.GoldenCode2014.RobotMap;
import org.usfirst.frc3620.GoldenCode2014.commands.*;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.networktables.NetworkTable;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
/**
 *
 */
public class CatapultSubsystem extends Subsystem {
boolean isCocked = false;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    SpeedController chooChoomotor = RobotMap.catapultSubsystemChooChoomotor;
    AnalogChannel chooChooEncoder = RobotMap.catapultSubsystemChooChooEncoder;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void turnMotor() {
        chooChoomotor.set(-0.5);
    }
    public void motorOff() {
        chooChoomotor.set(0);
    }
    public boolean inPosition() {
        double encoderValue = chooChooEncoder.getAverageVoltage();
        SmartDashboard.putData("encoder", chooChooEncoder);
        if ((0.403 < encoderValue) && (encoderValue < .600)) { //Checks if the motor is in the
            return true;                                  //cocked position
        } else {
            return false;
        }
    }
    //NetworkTable visionTable;
    public boolean visionSeesHotGoal() {
        return SmartDashboard.getBoolean("okToFire", false);
    }
    public void init() {
        //visionTable = NetworkTable.getTable("vision");
        SmartDashboard.putBoolean("okToFire", false);
    }
    public boolean isCocked() {
        return isCocked;
    }
    public void setIsCocked(boolean newIsCocked){
        isCocked = newIsCocked;
    }
   
}