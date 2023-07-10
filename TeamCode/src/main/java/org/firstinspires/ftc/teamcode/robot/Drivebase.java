package org.firstinspires.ftc.teamcode.robot;

import com.qualcomm.robotcore.hardware.DcMotor;

import org.firstinspires.ftc.robotcore.external.Telemetry;



// todo fix the errors in this file - you will have succeeded once the project can build
public class Drivebase {

    // Constructing the 4 motors used on a mecanum drive
    public DcMotor leftFrontDrive;
    public rightFrontDrive;
    public DcMotor rightBackDrive

    public Drivebase(HardwareMap hardwareMap, Telemetry telemetry){

        leftFrontDrive = hardwareMap.get(DcMotor.class,
        leftBackDrive = hardwareMap.get(DcMotor.class, "");
        rightFrontDrive = hardwareMap.get(DcMotor.class, "");
         = hardwareMap.get(DcMotor.class, "");

        leftFrontDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        leftBackDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightFrontDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        rightBackDrive.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);

        telemetry.update();
    }

    public calculateDrivePowers(double y, double x, double rot){

        setDrivePowers();



    // Sends power to the drive motors
    public void setDrivePowers(double lf, double lb, double rf, double rb){
        leftFrontDrive.setPower(lf);
        Drive.setPower(lb);
        rightFrontDrivesetPower(rf);
        rightBackDrive.setPower(rb);
    }


