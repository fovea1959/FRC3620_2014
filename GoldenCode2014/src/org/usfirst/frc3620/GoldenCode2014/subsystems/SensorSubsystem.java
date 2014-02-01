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
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc3620.GoldenCode2014.Robot;
/**
 *
 */
public class SensorSubsystem extends Subsystem {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    DigitalOutput arduino8 = RobotMap.sensorSubsystemArduino8;
    DigitalInput digitalSonar = RobotMap.sensorSubsystemDigitalSonar;
    AnalogChannel analogSonar = RobotMap.sensorSubsystemAnalogSonar;
    DigitalOutput arduino1 = RobotMap.sensorSubsystemArduino1;
    DigitalOutput arduino2 = RobotMap.sensorSubsystemArduino2;
    DigitalOutput arduino4 = RobotMap.sensorSubsystemArduino4;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        setDefaultCommand(new IndicatorLightsCommand());
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    Counter counter = new Counter(digitalSonar);
    public void init() {
        counter.start();
        counter.setSemiPeriodMode(true);
        System.out.println("Initializing");
    }
    public double getAnalogDistanceInFeet(){
        return (analogSonar.getAverageVoltage() / .0098) / 12;
       
    }
    public void sendToDriverStation() {
      
        SmartDashboard.putNumber("analog sonar", analogSonar.getVoltage());
        SmartDashboard.putNumber("average analog sonar", analogSonar.getAverageVoltage());
        SmartDashboard.putNumber("digital sonar", counter.getPeriod());
        SmartDashboard.putNumber("feet", getAnalogDistanceInFeet());
        SmartDashboard.putBoolean("fire", Robot.catapultSubsystem.visionSeesHotGoal());
    }
    public void sendToArduino(int i){
        
        if((i&1) != 0){
            arduino1.set(true);
        }
        else{
             arduino1.set(false);
        }
        if((i&2) != 0){
            arduino2.set(true);
        }
        else{
             arduino2.set(false);
        }
        if((i&4) != 0){
            arduino4.set(true);
        }
        else{
             arduino4.set(false);
        }
        if((i&18) != 0){
            arduino8.set(true);
        }
        else{
             arduino8.set(false);
        }
    }
}
