/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class Elavator extends Subsystem {
  // Put methods for controlling this subsystem
  private WPI_TalonSRX elavatorMotor = new WPI_TalonSRX(RobotMap.elevatorMotor);
  private DigitalInput elavatorSwitch = new DigitalInput(4);
  private DigitalInput elavatorSwitch2 = new DigitalInput(5);

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
  public void setposition(int pos) {
    elavatorMotor.set(ControlMode.Position,pos);
  }
  public int getEncoder() {
    return elavatorMotor.getSelectedSensorPosition();
  }
}
