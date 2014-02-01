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

/**
 *
 */
public class PneumaticSubsystem extends Subsystem {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    DoubleSolenoid loaderCylinder = RobotMap.pneumaticSubsystemLoaderCylinder;
    DoubleSolenoid pushCylinder = RobotMap.pneumaticSubsystemPushCylinder;
    Compressor compressor1 = RobotMap.pneumaticSubsystemCompressor1;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    public void initDefaultCommand() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DEFAULT_COMMAND
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    boolean DEBUG = false;

    public void loaderPushOut() {
        if (DEBUG) {
            System.out.println("Load Forward");
        }
        loaderCylinder.set(DoubleSolenoid.Value.kForward);
    }

    public void loaderPushIn() {
        if (DEBUG) {
            System.out.println("Load Reverse");
        }
        loaderCylinder.set(DoubleSolenoid.Value.kReverse);
    }

    public void loaderRelax() {
        if (DEBUG) {
            System.out.println("Load Relax");
        }
        loaderCylinder.set(DoubleSolenoid.Value.kOff);
    }

    public void pusherPushOut() {
        if (DEBUG) {
            System.out.println("Push Forward");
        }
        pushCylinder.set(DoubleSolenoid.Value.kForward);
    }

    public void pusherPushIn() {
        if (DEBUG) {
            System.out.println("Push Reverse");
        }
        pushCylinder.set(DoubleSolenoid.Value.kReverse);
    }

    public void pusherRelax() {
        if (DEBUG) {
            System.out.println("Push Relax");
        }
        pushCylinder.set(DoubleSolenoid.Value.kOff);
    }
}
