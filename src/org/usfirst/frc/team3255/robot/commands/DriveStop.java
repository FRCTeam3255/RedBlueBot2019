package org.usfirst.frc.team3255.robot.commands;

import org.usfirst.frc.team3255.robot.Robot;

import edu.wpi.first.wpilibj.command.InstantCommand;

/**
 *
 */
public class DriveStop extends InstantCommand {

    public DriveStop() {
        super();
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(Robot.drivetrain);
    }

    // Called once when the command executes
    protected void initialize() {
    	Robot.drivetrain.setSpeed(0);
    }

}
