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
    
import edu.wpi.first.wpilibj.*;
import edu.wpi.first.wpilibj.CounterBase.EncodingType; import edu.wpi.first.wpilibj.PIDSource.PIDSourceParameter;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import java.util.Vector;
/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static DoubleSolenoid pneumaticSubsystemLoaderCylinder1;
    public static DoubleSolenoid pneumaticSubsystemPushCylinder;
    public static Compressor pneumaticSubsystemCompressor1;
    public static DoubleSolenoid pneumaticSubsystemLoadCylinder2;
    public static SpeedController driveSubsystemSpeedController2;
    public static SpeedController driveSubsystemSpeedController3;
    public static SpeedController driveSubsystemSpeedController5;
    public static SpeedController driveSubsystemSpeedController6;
    public static RobotDrive driveSubsystemPrimaryDrive;
    public static SpeedController driveSubsystemSpeedController4;
    public static SpeedController driveSubsystemSpeedController1;
    public static RobotDrive driveSubsystemTurboDrive;
    public static Encoder driveSubsystemDriveEncoder2;
    public static Encoder driveSubsystemDriveEncoder1;
    public static DigitalOutput sensorSubsystemArduino8;
    public static DigitalInput sensorSubsystemDigitalSonar;
    public static AnalogChannel sensorSubsystemAnalogSonar;
    public static DigitalOutput sensorSubsystemArduino1;
    public static DigitalOutput sensorSubsystemArduino2;
    public static DigitalOutput sensorSubsystemArduino4;
    public static SpeedController catapultSubsystemChooChoomotor;
    public static AnalogChannel catapultSubsystemChooChooEncoder;
    public static SpeedController intakeSubsystemIntakeMotor;
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        pneumaticSubsystemLoaderCylinder1 = new DoubleSolenoid(1, 1, 2);      
	
        
        pneumaticSubsystemPushCylinder = new DoubleSolenoid(1, 5, 6);      
	
        
        pneumaticSubsystemCompressor1 = new Compressor(1, 11, 1, 2);
	
        
        pneumaticSubsystemLoadCylinder2 = new DoubleSolenoid(1, 3, 4);      
	
        
        driveSubsystemSpeedController2 = new Talon(1, 2);
	LiveWindow.addActuator("DriveSubsystem", "Speed Controller 2", (Talon) driveSubsystemSpeedController2);
        
        driveSubsystemSpeedController3 = new Talon(1, 3);
	LiveWindow.addActuator("DriveSubsystem", "Speed Controller 3", (Talon) driveSubsystemSpeedController3);
        
        driveSubsystemSpeedController5 = new Talon(1, 5);
	LiveWindow.addActuator("DriveSubsystem", "Speed Controller 5", (Talon) driveSubsystemSpeedController5);
        
        driveSubsystemSpeedController6 = new Talon(1, 6);
	LiveWindow.addActuator("DriveSubsystem", "Speed Controller 6", (Talon) driveSubsystemSpeedController6);
        
        driveSubsystemPrimaryDrive = new RobotDrive(driveSubsystemSpeedController2, driveSubsystemSpeedController3,
              driveSubsystemSpeedController5, driveSubsystemSpeedController6);
	
        driveSubsystemPrimaryDrive.setSafetyEnabled(false);
        driveSubsystemPrimaryDrive.setExpiration(0.1);
        driveSubsystemPrimaryDrive.setSensitivity(0.5);
        driveSubsystemPrimaryDrive.setMaxOutput(1.0);
        driveSubsystemPrimaryDrive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
        driveSubsystemPrimaryDrive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
        driveSubsystemPrimaryDrive.setInvertedMotor(RobotDrive.MotorType.kFrontRight, true);
        driveSubsystemPrimaryDrive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);
        driveSubsystemSpeedController4 = new Talon(1, 4);
	LiveWindow.addActuator("DriveSubsystem", "Speed Controller 4", (Talon) driveSubsystemSpeedController4);
        
        driveSubsystemSpeedController1 = new Victor(1, 1);
	LiveWindow.addActuator("DriveSubsystem", "Speed Controller 1", (Victor) driveSubsystemSpeedController1);
        
        driveSubsystemTurboDrive = new RobotDrive(driveSubsystemSpeedController1, driveSubsystemSpeedController4);
	
        driveSubsystemTurboDrive.setSafetyEnabled(false);
        driveSubsystemTurboDrive.setExpiration(0.1);
        driveSubsystemTurboDrive.setSensitivity(0.5);
        driveSubsystemTurboDrive.setMaxOutput(1.0);
        driveSubsystemTurboDrive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
        driveSubsystemTurboDrive.setInvertedMotor(RobotDrive.MotorType.kRearRight, true);        
        driveSubsystemDriveEncoder2 = new Encoder(1, 9, 1, 10, false, EncodingType.k4X);
	LiveWindow.addSensor("DriveSubsystem", "DriveEncoder2", driveSubsystemDriveEncoder2);
        driveSubsystemDriveEncoder2.setDistancePerPulse(0.04908734);
        driveSubsystemDriveEncoder2.setPIDSourceParameter(PIDSourceParameter.kRate);
        driveSubsystemDriveEncoder2.start();
        driveSubsystemDriveEncoder1 = new Encoder(1, 7, 1, 8, false, EncodingType.k4X);
	LiveWindow.addSensor("DriveSubsystem", "DriveEncoder1", driveSubsystemDriveEncoder1);
        driveSubsystemDriveEncoder1.setDistancePerPulse(0.04908734);
        driveSubsystemDriveEncoder1.setPIDSourceParameter(PIDSourceParameter.kRate);
        driveSubsystemDriveEncoder1.start();
        sensorSubsystemArduino8 = new DigitalOutput(1, 4);
	
        
        sensorSubsystemDigitalSonar = new DigitalInput(1, 5);
	LiveWindow.addSensor("SensorSubsystem", "DigitalSonar", sensorSubsystemDigitalSonar);
        
        sensorSubsystemAnalogSonar = new AnalogChannel(1, 6);
	LiveWindow.addSensor("SensorSubsystem", "AnalogSonar", sensorSubsystemAnalogSonar);
        
        sensorSubsystemArduino1 = new DigitalOutput(1, 1);
	
        
        sensorSubsystemArduino2 = new DigitalOutput(1, 2);
	
        
        sensorSubsystemArduino4 = new DigitalOutput(1, 3);
	
        
        catapultSubsystemChooChoomotor = new Victor(1, 7);
	LiveWindow.addActuator("CatapultSubsystem", "ChooChoo motor", (Victor) catapultSubsystemChooChoomotor);
        
        catapultSubsystemChooChooEncoder = new AnalogChannel(1, 1);
	LiveWindow.addSensor("CatapultSubsystem", "ChooChooEncoder", catapultSubsystemChooChooEncoder);
        
        intakeSubsystemIntakeMotor = new Talon(1, 8);
	LiveWindow.addActuator("IntakeSubsystem", "IntakeMotor", (Talon) intakeSubsystemIntakeMotor);
        
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        pneumaticSubsystemCompressor1.start();
        
    }
}
