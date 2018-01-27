package main.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.command.Subsystem;
import main.Constants;
import main.HardwareAdapter;
import main.commands.drivetrain.Drive;

public class Intake extends Subsystem implements Constants, HardwareAdapter {
	public static enum WheelStates {
		In, Out, Off
	}
	public static enum PneumaticStates {
		Opened, Closed
	}
	
	@Override
	protected void initDefaultCommand() {
		
	}
}