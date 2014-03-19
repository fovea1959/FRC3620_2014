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
import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc3620.GoldenCode2014.Robot;
/**
 *
 */
public class PusherCylinderCommand extends Command {
    long pusherT0 = 0;
    public PusherCylinderCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.pneumaticSubsystem);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }
    // Called just before this Command runs the first time
    protected void initialize() {
       
        pusherT0 = System.currentTimeMillis();
    }
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        Robot.pneumaticSubsystem.clampUp();
         long pusherElapsedTime = System.currentTimeMillis() - pusherT0;
        if (pusherElapsedTime >= 500) {
           Robot.pneumaticSubsystem.pusherPushOut();
        } 
    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        long pusherElapsedTime = System.currentTimeMillis() - pusherT0;
        if (pusherElapsedTime >= 1500) {
            return true;
        } else {
            return false;
        }
    }
    
    // Called once after isFinished returns true
    protected void end() {
        Robot.pneumaticSubsystem.pusherPushIn();
    }
    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
