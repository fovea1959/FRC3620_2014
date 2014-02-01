// RobotBuilder Version: 1.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.
package org.usfirst.frc3620.GoldenCode2014;
import org.usfirst.frc3620.GoldenCode2014.commands.*;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public JoystickButton cockAndShootButton;
    public JoystickButton reverseToggle;
    public JoystickButton extendIntakeButton;
    public JoystickButton loaderCylinderButton;
    public JoystickButton pusherCylinderButton;
    public Joystick joystick1;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public OI() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        joystick1 = new Joystick(1);
        
        pusherCylinderButton = new JoystickButton(joystick1, 6);
        pusherCylinderButton.whileHeld(new ManipulatePushCylinderCommand());
        loaderCylinderButton = new JoystickButton(joystick1, 5);
        loaderCylinderButton.whileHeld(new ManipulateLoaderCylinderCommand());
        extendIntakeButton = new JoystickButton(joystick1, 2);
        extendIntakeButton.whileHeld(new ExtendIntakeCommand());
        reverseToggle = new JoystickButton(joystick1, 3);
        reverseToggle.whenPressed(new DriveToggleReverseCommand());
        cockAndShootButton = new JoystickButton(joystick1, 1);
        cockAndShootButton.whenPressed(new CockAndShoot());
	    
        // SmartDashboard Buttons
        SmartDashboard.putData("AutonomousWait", new AutonomousWait());
        SmartDashboard.putData("DriveArcadeCommand", new DriveArcadeCommand());
        SmartDashboard.putData("ManipulateLoaderCylinderCommand", new ManipulateLoaderCylinderCommand());
        SmartDashboard.putData("DriveToggleReverseCommand", new DriveToggleReverseCommand());
        SmartDashboard.putData("ManipulatePushCylinderCommand", new ManipulatePushCylinderCommand());
        SmartDashboard.putData("SensorCommand", new SensorCommand());
        SmartDashboard.putData("CockAndShoot", new CockAndShoot());
        SmartDashboard.putData("AutonomousCommandGroup", new AutonomousCommandGroup());
        SmartDashboard.putData("AutonomousMove", new AutonomousMove());
        SmartDashboard.putData("AutonomousFire", new AutonomousFire());
        SmartDashboard.putData("IndicatorLightsCommand", new IndicatorLightsCommand());
        SmartDashboard.putData("ExtendIntakeCommand", new ExtendIntakeCommand());
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
    
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
    public Joystick getJoystick1() {
        return joystick1;
    }
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=FUNCTIONS
}
