package org.usfirst.frc.team3255.robot.commands;

import org.usfirst.frc.team3255.robot.Robot;

import edu.wpi.first.wpilibj.command.InstantCommand;

/**
 *
 */
public class KickerRetract extends InstantCommand {

    public KickerRetract() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.kicker);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	Robot.kicker.retract();
    }
}
