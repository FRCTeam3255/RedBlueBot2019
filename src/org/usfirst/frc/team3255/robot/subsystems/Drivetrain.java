package org.usfirst.frc.team3255.robot.subsystems;

import org.usfirst.frc.team3255.robot.commands.DriveWithJoystick;

import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class Drivetrain extends Subsystem {
	private WPI_TalonSRX leftTalon = null;
	private WPI_TalonSRX rightTalon = null;
	private DifferentialDrive differentialDrive = null;
	
    public Drivetrain() {
		super();

		leftTalon = new WPI_TalonSRX(1);
		rightTalon = new WPI_TalonSRX(3);
		
		leftTalon.setNeutralMode(NeutralMode.Brake);
		rightTalon.setNeutralMode(NeutralMode.Brake);
		
		differentialDrive = new DifferentialDrive(leftTalon, rightTalon);
    }

    public void setSpeed(double speed) {
    	leftTalon.set(-speed);
    	rightTalon.set(speed);
    }
    
    public void arcadeDrive(double moveSpeed, double rotateSpeed) {
    	differentialDrive.arcadeDrive(moveSpeed, rotateSpeed);
    }

	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
		setDefaultCommand(new DriveWithJoystick());
    }
}

