/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.Grab_cmd;

/**
 * Add your docs here.
 */
public class GrabMotor_sub extends Subsystem {
  private Talon motor =  new Talon(RobotMap.GRAB_MOTOR_ID);
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
  setDefaultCommand(new Grab_cmd(0,0)); // this will be a new instance of the command
                                          // and when this command is finished, it is destroyed.
                                          // note any variables will be destroyed as well.
  }

  public void setMotor(double speed) {
    motor.set(speed);

  }
}  