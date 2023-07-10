package org.firstinspires.ftc.teamcode.robot;

import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.robotcore.external.Telemetry;

// todo pull your code from the previous level and write working code for this function
public class BallDrive {

    // Constructing the 4 motors used on a mecanum drive
    public DcMotor leftDrive;

    public BallDrive(HardwareMap hardwareMap, Telemetry telemetry){

        telemetry.update();
    }

    // todo write a metaDrive function that takes in controller input and alters the inputs
    //      sent calculateDrivePowers so that the robot is always driving straight relative to
    //      its starting position.
    // hint: use the gyro heading.

    public calculateDrivePowers(double y, double x, double rot){

        setDrivePowers();



    // Sends power to the drive motors
    public void setDrivePowers(){
    }


