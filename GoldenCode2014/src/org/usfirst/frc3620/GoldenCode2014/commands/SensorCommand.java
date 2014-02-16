// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
package org.usfirst.frc3620.GoldenCode2014.commands;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import org.usfirst.frc3620.GoldenCode2014.Robot;
import org.usfirst.frc3620.GoldenCode2014.subsystems.SensorSubsystem;
/**
 *
 */
public class SensorCommand extends Command {
    double t1;
    double t2;
    double difference;
    boolean isFirstTime = true;
    public SensorCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.sensorSubsystem);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }
    // Called just before this Command runs the first time
    protected void initialize() {
        isFirstTime = true;
    }
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        double distance = Robot.sensorSubsystem.getDigitalDistanceInFeet();
        
        if (isFirstTime) {
            t1 = Robot.sensorSubsystem.getDigitalDistanceInFeet();
            isFirstTime = false;
        } else {
            t2 = Robot.sensorSubsystem.getDigitalDistanceInFeet();
            isFirstTime = true;
        }
        difference = (t1 - t2);
     
        if (difference <= -1 || difference >= 1) {
            Robot.sensorSubsystem.sonarErrorTrue();
        } else {
            Robot.sensorSubsystem.sonarErrorfalse();
        }
        if (distance <= 12 && distance >= 10 && Robot.sensorSubsystem.sonarErrorfalse()) {
            Robot.sensorSubsystem.sendToArduino(SensorSubsystem.GREEN);
        } else {
            if (Robot.driverStation.getAlliance() == DriverStation.Alliance.kBlue) {
                Robot.sensorSubsystem.sendToArduino(SensorSubsystem.BLUE);
            } else {
                Robot.sensorSubsystem.sendToArduino(SensorSubsystem.RED);
            }
        }
    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }
    // Called once after isFinished returns true
    protected void end() {
    }
    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
