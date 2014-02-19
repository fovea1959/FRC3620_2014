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
import org.usfirst.frc3620.GoldenCode2014.CatapultState;
import org.usfirst.frc3620.GoldenCode2014.Robot;
/**
 *
 */
public class AutonomousFire extends Command {
    long startTime;
    long elapsedTime;
    public AutonomousFire() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.catapultSubsystem);
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }
    // Called just before this Command runs the first time
    protected void initialize() {
        System.out.println("autonomousfire init");
        Robot.catapultSubsystem.setCatapultState(CatapultState.SHOOTING_DELAY);
    }
    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
//        System.out.println("autoomous firing");
    }
    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    if(Robot.catapultSubsystem.getCatapultState() == CatapultState.SHOT){
        return true;
    }
    else if(Robot.catapultSubsystem.getCatapultState() == CatapultState.SHOOTING_DELAY){
    return false;
    }
    else if(Robot.catapultSubsystem.getCatapultState() == CatapultState.SHOOTING){
    return false;
    }
    return true;
    }
    // Called once after isFinished returns true
    protected void end() {
        System.out.println("autonomous end");
    }
    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
