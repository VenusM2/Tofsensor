// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import com.revrobotics.Rev2mDistanceSensor;

import com.revrobotics.Rev2mDistanceSensor.Port;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class tof extends SubsystemBase {
  private Rev2mDistanceSensor distOnboard; 

  /** Creates a new tof. */
  public tof() {
    distOnboard = new Rev2mDistanceSensor(Port.kOnboard);
    distOnboard.setAutomaticMode(true);
  }

  public double getDistance(){
    return distOnboard.getRange();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
