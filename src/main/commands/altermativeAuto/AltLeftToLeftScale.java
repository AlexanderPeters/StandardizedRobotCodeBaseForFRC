package main.commands.altermativeAuto;

import edu.wpi.first.wpilibj.command.WaitCommand;
import interfacesAndAbstracts.ImprovedCommandGroup;
import main.commands.drivetrain.AltDistanceDriveStraight;
import main.commands.drivetrain.DistanceDriveStraight;
import main.commands.drivetrain.DrivePIDWithPulse;
import main.commands.drivetrain.TurnToAngle;
import main.commands.drivetrain.TurnToAngleGyro;
import main.commands.elevator.MovePID;
import main.commands.elevator.MoveToBottom;
import main.commands.elevator.MoveToTop;
import main.commands.intake.SpinOff;
import main.commands.intake.SpinOut;
import main.commands.pneumatics.arm.ArmClose;
import main.commands.pneumatics.arm.ArmOpen;
import main.commands.pneumatics.arm.SwitchArm;
import main.commands.pneumatics.tilt.SwitchTilt;
import main.commands.pneumatics.tilt.TiltDown;
import main.commands.pneumatics.tilt.TiltUp;

public class AltLeftToLeftScale extends ImprovedCommandGroup {
	public AltLeftToLeftScale() {
		addSequential(new AltDistanceDriveStraight(230, 5));
		addSequential(new TurnToAngleGyro(30, 3));
//		addSequential(new WaitCommand(0.3));
		addSequential(new DistanceDriveStraight(12));
		addSequential(new TiltDown());
		addSequential(new MovePID(elevatorHeight, 4));
		addSequential(new DistanceDriveStraight(40)); // total 55
		addSequential(new WaitCommand(0.1));
		addSequential(new ArmOpen());
		addSequential(new WaitCommand(0.3));
		addSequential(new TiltUp());
		addSequential(new WaitCommand(0.3));
		addSequential(new ArmClose());
		addSequential(new WaitCommand(0.3));
		addSequential(new DistanceDriveStraight(-30));
		addSequential(new MoveToBottom(5));
		
		addSequential(new TurnToAngleGyro(60, 2));
		addSequential(new TiltDown());
		addSequential(new ArmOpen());
		addSequential(new AltDistanceDriveStraight(24,2));
		addSequential(new ArmClose());
	}
}
