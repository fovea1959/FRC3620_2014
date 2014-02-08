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
import org.usfirst.frc3620.GoldenCode2014.Robot;
/**
 *
 */
public class PneumaticSubsystem extends Subsystem {
    boolean DEBUG = false;
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    DoubleSolenoid loaderCylinder1 = RobotMap.pneumaticSubsystemLoaderCylinder1;
    DoubleSolenoid pushCylinder = RobotMap.pneumaticSubsystemPushCylinder;
    Compressor compressor1 = RobotMap.pneumaticSubsystemCompressor1;
    DoubleSolenoid loadCylinder2 = RobotMap.pneumaticSubsystemLoadCylinder2;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void loaderPushOut() {
        if (DEBUG) {
            System.out.println("Load Forward");
        }
        loaderCylinder1.set(DoubleSolenoid.Value.kForward);
        loadCylinder2.set(DoubleSolenoid.Value.kForward);
        Robot.getTelemetryTable().putString("pneumatics.load", "forward");
    }
    public void loaderPushIn() {
        if (DEBUG) {
            System.out.println("Load Reverse");
        }
        loaderCylinder1.set(DoubleSolenoid.Value.kReverse);
        loadCylinder2.set(DoubleSolenoid.Value.kReverse);
        Robot.getTelemetryTable().putString("pneumatics.load", "reverse");
    }
    public void loaderRelax() {
        if (DEBUG) {
            System.out.println("Load Relax");
        }
        loaderCylinder1.set(DoubleSolenoid.Value.kOff);
        loaderCylinder1.set(DoubleSolenoid.Value.kOff);
        Robot.getTelemetryTable().putString("pneumatics.load", "off");
    }
    public void pusherPushOut() {
        if (DEBUG) {
            System.out.println("Push Forward");
        }
        pushCylinder.set(DoubleSolenoid.Value.kForward);
        Robot.getTelemetryTable().putString("pneumatics.push", "forward");
    }
    public void pusherPushIn() {
        if (DEBUG) {
            System.out.println("Push Reverse");
        }
        pushCylinder.set(DoubleSolenoid.Value.kReverse);
        Robot.getTelemetryTable().putString("pneumatics.push", "reverse");
    }
    public void pusherRelax() {
        if (DEBUG) {
            System.out.println("Push Relax");
        }
        pushCylinder.set(DoubleSolenoid.Value.kOff);
        Robot.getTelemetryTable().putString("pneumatics.push", "off");
    }
    /**
     * add any needed code to run when robot powers up.
     */
    public void init() {
        loaderPushIn();
        pusherPushIn();
    }
    /**
     * add any needed code to run if the mode changes.
     */
    public void modeChanged() {
        // 
    }
    /**
     * add any needed code to run everytime periodic is called.
     */
    public void periodic() {
        //  
        Robot.getTelemetryTable().putBoolean("pneumatics.pressure", compressor1.getPressureSwitchValue());
    }
}
