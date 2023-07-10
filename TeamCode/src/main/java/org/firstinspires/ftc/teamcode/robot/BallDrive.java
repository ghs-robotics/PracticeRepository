package org.firstinspires.ftc.teamcode.robot;

import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.robotcore.external.Telemetry;

// todo pull your code from the previous level and write working code for this function
// todo write code for a balldrive - look at our 2019 balldrive bot for ideas
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


