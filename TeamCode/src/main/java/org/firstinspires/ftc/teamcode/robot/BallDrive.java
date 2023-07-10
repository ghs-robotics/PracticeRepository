package org.firstinspires.ftc.teamcode.robot;

import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class BallDrive {

    // Constructing the 4 motors used on a mecanum drive
    public DcMotor leftDrive;

    public BallDrive(HardwareMap hardwareMap, Telemetry telemetry){

        telemetry.update();
    }

    public calculateDrivePowers(double y, double x, double rot){

        setDrivePowers();



        // Sends power to the drive motors
        public void setDrivePowers(){
        }


