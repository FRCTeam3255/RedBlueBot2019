package org.usfirst.frc.team3255.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Kicker extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

	private DoubleSolenoid solenoid = null;
	
	public Kicker() {
		solenoid = new DoubleSolenoid(0, 1);
	}
	
	public void kick() {
		solenoid.set(Value.kForward);
	}
	
	public void retract() {
		solenoid.set(Value.kReverse);		
	}
	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

